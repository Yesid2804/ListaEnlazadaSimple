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
public class Lista6_num1 {
    Nodo6_num1 cabeza1;
    int size;

    public Lista6_num1(){
        this.cabeza1=null;
        size=0;
    }
    
    public boolean estaVacia(){
        return this.cabeza1==null;
    }
    public int size(){
        return size;
    } 
    
    public void añadirALPrimero(int num){
        if (cabeza1==null) {
            cabeza1=new Nodo6_num1(num);

        }else{
            Nodo6_num1 temp=cabeza1;
            Nodo6_num1 nuevo=new Nodo6_num1(num);
            nuevo.enlazarSiguiente(temp);
            this.cabeza1=nuevo;
        }
        size++;
    }      
   public void mostrar(){
        Nodo6_num1 aux=this.cabeza1;
        while (aux!=null) {
            System.out.print("["+aux.dato+"]--");
            aux=aux.siguiente;
        }
    }
   
   
    public Nodo6_num1 obtener(int index){
        int con=0;
        Nodo6_num1 temporal=this.cabeza1;
        while (con!=index) {            
            temporal=temporal.siguiente;
            con++;
        }
        return temporal;
    }
    
    public void retirarRepetidos(Lista6_num2 lista2){
        for (int i = 0; i < lista2.size; i++) {
            Nodo6_num2 Nodo6_num2=lista2.obtener(i);
            int num = Nodo6_num2.dato;
            for (int j = 0; j < this.size; j++) {
                Nodo6_num1 nodo6_num1 = this.obtener(j);
                if(nodo6_num1.dato==num){
                    this.retirarPorIndex(j);
                }
            }
        }
    }
    
    public boolean retirarPorIndex(int index){
        Nodo6_num1 temporal=this.cabeza1;
        Nodo6_num1 anterior = null;
        int cont=0;
        
        if (index==0) {
            this.cabeza1=temporal.siguiente;
        }else{
            while (index!=cont) {            
                anterior=temporal;
                temporal=temporal.siguiente;
                cont++;
            }
        }
       
        anterior.enlazarSiguiente(temporal.siguiente);
        this.size--;

        return true;
    }
}
