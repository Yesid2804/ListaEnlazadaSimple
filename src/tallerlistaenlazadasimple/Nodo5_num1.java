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
public class Nodo5_num1 {
    Nodo5_num1 siguiente;
    String refe;
    long enBodega;

    public Nodo5_num1(String refe,long enBodega) {
        this.refe = refe;
        this.enBodega = enBodega;
        this.siguiente = null;
    }
    public void enlazarSiguiente(Nodo5_num1 n){
        siguiente=n; 
    }
}
