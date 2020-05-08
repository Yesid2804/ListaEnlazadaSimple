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
public class ListaEjercicio1 extends Lista{
    Nodo cabeza;
    int size;
    public void mostrar(){
        Nodo aux=this.cabeza;
        while (aux!=null) {
            System.out.print("["+aux.dato+"]--");
            aux=aux.siguiente;
        }
    }
}
