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
public class Nodo6_num1{
    Nodo6_num1 siguiente;
    int dato;

    public Nodo6_num1() {
    }
    
    public Nodo6_num1(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public void enlazarSiguiente(Nodo6_num1 n){
        siguiente=n; 
    }
}
