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
public class lista7_num1 {
    Nodo7_num1 cabeza1;
    int size;
    public lista7_num1(){
        this.cabeza1=null;
        size=0;
    }
    
    public boolean estaVacia(){
        return this.cabeza1==null;
    }
    public int size(){
        return size;
    }
    
    public void añadirALPrimero(int codigo){
        if (cabeza1==null) {
            cabeza1=new Nodo7_num1(codigo);
        }else{
            Nodo7_num1 temp=cabeza1;
            Nodo7_num1 nuevo=new Nodo7_num1(codigo);
            nuevo.enlazarSiguiente(temp);
            this.cabeza1=nuevo;
        }
        size++;
    }
        public void mostrar(){
        int i=1;
        Nodo7_num1 aux=this.cabeza1;
        while (aux!=null) {
            System.out.println("[codigo: "+aux.codigo+"]");
            System.out.println("");
            aux=aux.siguiente;
            i++;
        }
        if (cabeza1==null) {
            i=1;
        }
    }
        
        
    public void actualizar(lista7_num2 lista2){
        for (int i = 0; i < lista2.size; i++) {
            Nodo7_num2 nodo2=lista2.obtener(i);
            for (int j = 0; j < this.size; j++) {
                Nodo7_num1 nodo1=this.obtener(j);
                if (nodo2.Accion=='A') {
                    this.añadirALPrimero(nodo2.codigo);
                }else{
                    
                    
                }
            }
        }
        
        
    }
        
    public Nodo7_num1 obtener(int index){
        int con=0;
        Nodo7_num1 temporal=this.cabeza1;
        while (con!=index) {            
            temporal=temporal.siguiente;
            con++;
        }
        return temporal;
    }     
        
}
