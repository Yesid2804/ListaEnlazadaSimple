   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlistaenlazadasimple;

import java.util.Scanner;

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
    public void mostrarRegistro(){
        int i=1;
        NodoMedicamento aux=this.cabeza;
        while (aux!=null) {
            System.out.println("Medicamento #"+i);
            System.out.println("Referencia: "+aux.refe_Medicamento+"");
            System.out.println("Nombre: "+aux.nom_Medicamento+"");
            System.out.println("Presentacion: "+aux.presentacion+"");
            System.out.println("Cantidad existente:"+aux.cant_existente+"");
            System.out.println("Maximo: "+aux.maximo+"");
            System.out.println("Minimo: "+aux.minimo+"");
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
     
    public void añadirALPrimero(NodoMedicamento nodoMedicamento){
        if (cabeza==null) {
            cabeza=nodoMedicamento;
        }else{
            NodoMedicamento temp=cabeza;
            NodoMedicamento nuevo=nodoMedicamento;
            nuevo.enlazarSiguiente(temp);
            this.cabeza=nuevo;
        }
        System.out.println("Medicamento Registrado");
        size++;
    }
    
    public boolean retirarPorReferencia(String ref){
        NodoMedicamento temporal=cabeza;
        NodoMedicamento anterior = null;
        
        if(temporal.refe_Medicamento==ref){
            cabeza=temporal.siguiente;
        }else{
            while (!ref.equals(temporal.refe_Medicamento)) {            
                anterior=temporal;
                temporal=temporal.siguiente;
            }
            anterior.enlazarSiguiente(temporal.siguiente);
        }
        this.size--;

        return true;
    }
    
    public void actualizarInformacioInventario(String ref){
        NodoMedicamento nuevo=this.crearNodo();
        this.reemplazarPorReferencia(ref, nuevo);
    }
    
    public boolean reemplazarPorReferencia(String ref,NodoMedicamento nodo){
        NodoMedicamento temporal=cabeza;
        for (int i = 0; i < this.size; i++) {
            if(temporal.refe_Medicamento.equals(ref)){
                temporal.cant_existente=nodo.cant_existente;
                temporal.maximo=nodo.maximo;
                temporal.minimo=nodo.minimo;
                temporal.nom_Medicamento=nodo.nom_Medicamento;
                temporal.presentacion=nodo.presentacion;
                temporal.refe_Medicamento=nodo.refe_Medicamento;
                return true;
            }
            temporal=temporal.siguiente;
        }
        return false; 
    }
    
    public boolean buscarPorReferencia(String ref){
        NodoMedicamento temporal=cabeza;
        for (int i = 0; i < this.size; i++) {
            if(temporal.refe_Medicamento.equals(ref))
                return true;
                temporal=temporal.siguiente;
        }
        return false; 
    }
    
    public NodoMedicamento crearNodo(){
        Scanner entrada = new Scanner(System.in);
        
        String refe_Medicamento,nom_Medicamento,presentacion;
        long cant_existente,maximo,minimo;
        System.out.println("Ingrese 0 para finalizar registro");
        System.out.println("-----Medicamento-----");
        System.out.print("Referencia del Medicamento:");refe_Medicamento=entrada.next(); 
        System.out.print("Nombre del Medicamento:");nom_Medicamento=entrada.next();
        System.out.print("Presentacion:");presentacion=entrada.next();
        System.out.print("Cantidad existente:");cant_existente=entrada.nextLong();
        System.out.print("Maximo:");maximo=entrada.nextLong();
        System.out.print("Minimo:");minimo=entrada.nextLong();

        NodoMedicamento nodoMedicamento = new NodoMedicamento(refe_Medicamento,nom_Medicamento,presentacion,cant_existente,maximo,minimo);
        
        return nodoMedicamento;
    }
}
