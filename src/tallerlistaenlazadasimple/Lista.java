/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlistaenlazadasimple;

/**
 *
 * @author Yesid
 */
public class Lista {
    Nodo cabeza;
    int size;
    
    public Lista(){
        this.cabeza=null;
        size=0;
    }
    
    public void mostrar(){
        Nodo aux=this.cabeza;
        while (aux!=null) {
            System.out.print("["+aux.dato+"]--");
            aux=aux.siguiente;
        }
    }
    
    public boolean estaVacia(){
        return this.cabeza==null;
    }
    
    public int size(){
        return size;
    } 
     
    public void añadirALPrimero(Object obj){
        if (cabeza==null) {
            cabeza=new Nodo(obj);
        }else{
            Nodo temp=cabeza;
            Nodo nuevo=new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza=nuevo;
        }
        size++;
    }
    
    public Nodo obtener(int index){
        int con=0;
        Nodo temporal=cabeza;
        while (con!=index) {            
            temporal=temporal.obtenerSiguiente();
            con++;
        }
        return temporal;
    }
    
    public boolean buscarDato(Object dato){
        Nodo temporal=cabeza;
        for (int i = 0; i < this.size; i++) {
            if(temporal.dato.equals(dato))
                return true;
            temporal=temporal.obtenerSiguiente();
        }
        return false; 
    }
    
}