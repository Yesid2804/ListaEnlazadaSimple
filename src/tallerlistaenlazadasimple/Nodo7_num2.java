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
public class Nodo7_num2 {
    Nodo7_num2 siguiente;
    int codigo;
    char Accion;
    
    public Nodo7_num2() {
    }
    
    public Nodo7_num2(int codigo,char Accion) {
        this.codigo =codigo;
        this.Accion=Accion;
        this.siguiente = null;
    }

    public void enlazarSiguiente(Nodo7_num2 n){
        siguiente=n; 
    }
    
}
