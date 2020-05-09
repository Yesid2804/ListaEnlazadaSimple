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
    Nodo7_num2 cabeza2;
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
    
        public void añadirALPrimero(int codigo,char accion){
        if (cabeza2==null) {
            cabeza2=new Nodo7_num2(codigo,accion);
        }else{
            Nodo7_num2 temp=cabeza2;
            Nodo7_num2 nuevo=new Nodo7_num2(codigo,accion);
            nuevo.enlazarSiguiente(temp);
            this.cabeza2=nuevo;
        }
        size++;
    }
        public void mostrar(){
        int i=1;
        Nodo7_num2 aux=this.cabeza2;
        while (aux!=null) {
            System.out.println("[codigo: "+aux.codigo+"]");
            System.out.println("[accion: "+aux.Accion+"]");
            System.out.println("");
            aux=aux.siguiente;
            i++;
        }
        if (cabeza2==null) {
            i=1;
        }
    }
    
    public Nodo7_num2 obtener(int index){
        int con=0;
        Nodo7_num2 temporal=this.cabeza2;
        while (con!=index) {            
            temporal=temporal.siguiente;
            con++;
        }
        return temporal;
    }
}
