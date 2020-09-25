
package listaenlazadabanco;

import java.util.LinkedList;


public class ListaEnlazadaBanco {

    
    static LinkedList<String> clienteRegular = new LinkedList<String>();
    static LinkedList<String> clientePrivilegiado = new LinkedList<String>();
    
    
    public static void main(String[] args) {
        ListaEnlazadaBanco listaBanco = new ListaEnlazadaBanco();
        listaBanco.insertarClientes("Privilegiado");
        listaBanco.insertarClientes("Regular");
        listaBanco.insertarClientes("Regular");
        listaBanco.insertarClientes("Regular");
        listaBanco.insertarClientes("Regular");
        listaBanco.insertarClientes("Privilegiado");
        listaBanco.insertarClientes("Regular");
        listaBanco.insertarClientes("Privilegiado");
        
        //iteracion de listas
        
        for(int i=0;i<clienteRegular.size();i++){
            System.out.println(""+clienteRegular.get(i));
        }
        
        for(int i=0;i<clientePrivilegiado.size();i++){
            System.out.println(""+clientePrivilegiado.get(i));
        }
        

        //atencion a clientes
        listaBanco.atencionClientes();
    }
    
    public void insertarClientes(String tipo){
        if(tipo=="Regular"){
            clienteRegular.add(tipo);
        }else{
            clientePrivilegiado.add(tipo);
        }
    }
    
    public void atencionClientes(){
        while((!clientePrivilegiado.isEmpty())||(!clienteRegular.isEmpty())){
            
            if(clienteRegular.size()>1){
                System.out.println("El cliente regular: "
                        +clienteRegular.getFirst()+" fue atendido");
                clienteRegular.removeFirst();
                System.out.println("El cliente regular: "
                        +clienteRegular.getFirst()+" fue atendido");
                clienteRegular.removeFirst();
            }else{
                System.out.println("El cliente regular: "
                        +clienteRegular.getFirst()+" fue atendido");
                clienteRegular.removeFirst();
            }
            if(clientePrivilegiado.size()>0){
                System.out.println("El cliente privilegiado: "
                        +clientePrivilegiado.getFirst()+" fue atendido");
                clientePrivilegiado.removeFirst();
                
                
            }
            
            
        }
    }
    
}
