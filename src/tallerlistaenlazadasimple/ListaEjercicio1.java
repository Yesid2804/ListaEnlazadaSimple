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
public class ListaEjercicio1 {
    NodoMedicamento cabeza;
    int size;
    public ListaEjercicio1(){
        this.cabeza=null;
        size=0;
    }
    public void mostrar(){
        int i=1;
        NodoMedicamento aux=this.cabeza;
        while (aux!=null) {
            System.out.println("Medicamento #"+i);
            System.out.println("[Referencia: "+aux.refe_Medicamento+"]--");
            System.out.println("[Nombre: "+aux.nom_Medicamento+"]--");
            System.out.println("[Presentacion: "+aux.presentacion+"]--");
            System.out.println("[Cantidad existente:"+aux.cant_existente+"]--");
            System.out.println("[Maximo: "+aux.maximo+"]--");
            System.out.println("[Minimo: "+aux.minimo+"]--");
            System.out.println("");
            aux=aux.siguiente;
            i++;
        }
        if (cabeza==null) {
            i=1;
        }
    }
    
    public boolean estaVacia(){
        return this.cabeza==null;
    }
    
    public int size(){
        return size;
    } 
     
    public void añadirALPrimero(String refe_Medicamento, String nom_Medicamento, String presentacion, long cant_existente, long maximo, long minimo){
        if (cabeza==null) {
            cabeza=new NodoMedicamento(refe_Medicamento,nom_Medicamento,presentacion,cant_existente,maximo,minimo);

        }else{
            NodoMedicamento temp=cabeza;
            NodoMedicamento nuevo=new NodoMedicamento(refe_Medicamento,nom_Medicamento,presentacion,cant_existente,maximo,minimo);
            nuevo.enlazarSiguiente(temp);
            this.cabeza=nuevo;
        }
        System.out.println("Medicamento Registrado");
        size++;
    }
        public boolean retirarPorReferencia(String ref){
        NodoMedicamento temporal=cabeza;
        NodoMedicamento anterior = null;
        
        if(temporal.refe_Medicamento!=ref){
            cabeza=temporal.siguiente;
        }else{
            while (ref!=temporal.refe_Medicamento) {            
                anterior=temporal;
                temporal=temporal.siguiente;
            }
            anterior.enlazarSiguiente(temporal.siguiente);
        }
        this.size--;

        return true;
    }
    
    public void actualizarInformacioInventario(String ref){
        retirarPorReferencia(ref);
    }
    
    
    
    
    
}
