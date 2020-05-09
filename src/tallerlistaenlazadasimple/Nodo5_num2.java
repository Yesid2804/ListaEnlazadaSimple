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
public class Nodo5_num2 {
    Nodo5_num2 siguiente;
    String refe;
    long enVenta;

    public Nodo5_num2( String refe, long enVenta) {
        this.refe = refe;
        this.enVenta = enVenta;
        this.siguiente = null;

    }
            
    public void enlazarSiguiente(Nodo5_num2 n){
        siguiente=n; 
    }

    
}
