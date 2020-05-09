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
public class lista7_num2 {
    Nodo7_num1 cabeza2;
    int size;
     public lista7_num2(){
        this.cabeza2=null;
        size=0;
    }
    
    public boolean estaVacia(){
        return this.cabeza2==null;
    }
    public int size(){
        return size;
    } 
}
