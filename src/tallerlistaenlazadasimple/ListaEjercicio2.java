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
public class ListaEjercicio2  extends Lista{
    
    public boolean retirar(Object dato){
        Nodo temporal=cabeza;
        Nodo anterior = null;
        
        if(temporal.obtenerDato()==dato){
            cabeza=temporal.obtenerSiguiente();
        }else{
            while (dato!=temporal.obtenerDato()) {            
                anterior=temporal;
                temporal=temporal.obtenerSiguiente();
            }
            anterior.enlazarSiguiente(temporal.obtenerSiguiente());
        }
        this.size--;

        return true;
    }
    
}
