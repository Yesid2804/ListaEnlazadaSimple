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
public class ListaEjercicio4 extends Lista{
    
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
    
    
    

}
