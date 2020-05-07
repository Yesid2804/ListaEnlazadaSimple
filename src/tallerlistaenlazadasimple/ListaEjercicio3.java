/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
// * and open the template in the editor.
 */
package tallerlistaenlazadasimple;

/**
 *
 * @author Yesid
 */
public class ListaEjercicio3 extends Lista{
    
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
    
    public boolean encotrarRepetido(){
        Nodo temporal=null;
        Object dato=null;

        for (int i = 0; i < this.size-1; i++) {
            int con=0;
            temporal = this.obtener(i);
            dato = temporal.dato;
            for (int j = i+1; j < this.size ; j++) {
                if(dato == this.obtener(j).dato){
                   con++;
                }
            }
            if(con>0){
                while(con!=0){
                    this.retirar(dato);
                    con--;
                }
            }
        }
        return true;
    }
}
