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
public class Lista6_num2 {
    Nodo6_num2 cabeza2;
    int size;

    public Lista6_num2(){
        this.cabeza2=null;
        size=0;
    }
    
    public boolean estaVacia(){
        return this.cabeza2==null;
    }
    public int size(){
        return size;
    } 
    
    public void añadirALPrimero(int num){
        if (cabeza2==null) {
            cabeza2=new Nodo6_num2(num);

        }else{
            Nodo6_num2 temp=cabeza2;
            Nodo6_num2 nuevo=new Nodo6_num2(num);
            nuevo.enlazarSiguiente(temp);
            this.cabeza2=nuevo;
        }
        size++;
    }     
    public void mostrar(){
        Nodo6_num2 aux=this.cabeza2;
        while (aux!=null) {
            System.out.print("["+aux.dato+"]--");
            aux=aux.siguiente;
        }
    }

    public Nodo6_num2 obtener(int index){
        int con=0;
        Nodo6_num2 temporal=this.cabeza2;
        while (con!=index) {            
            temporal=temporal.siguiente;
            con++;
        }
        return temporal;
    }
}
