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
public class Nodo7_num1 {
    Nodo7_num1 siguiente;
    int codigo;
    
    public Nodo7_num1() {
    }
    
    public Nodo7_num1(int codigo) {
        this.codigo = codigo;
        this.siguiente = null;
    }

    public void enlazarSiguiente(Nodo7_num1 n){
        siguiente=n; 
    }
}
