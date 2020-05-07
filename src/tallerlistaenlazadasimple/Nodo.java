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
public class Nodo {
    Object dato;
    Nodo siguiente;
     
    public  Nodo(Object dato){
          this.dato=dato; 
          this.siguiente=null;
    }
    
    public Object obtenerDato(){
        return dato;
    }
    
    public void enlazarSiguiente(Nodo n){
        siguiente=n; 
    }
    
    public Nodo obtenerSiguiente(){
        return siguiente;
    }
}
