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
public class Nodo6_num2 {
    Nodo6_num2 siguiente;
    int dato;
    
    public Nodo6_num2(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo6_num2() {
    }
        
    public void enlazarSiguiente(Nodo6_num2 n){
        siguiente=n; 
    }
    

}
