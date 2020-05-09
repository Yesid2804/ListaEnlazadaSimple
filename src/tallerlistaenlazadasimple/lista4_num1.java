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
public class lista4_num1{
    Nodo4_num1 cabeza1;
    int size;
     public lista4_num1(){
        this.cabeza1=null;
        size=0;
    }
    
    public boolean estaVacia(){
        return this.cabeza1==null;
    }
    public int size(){
        return size;
    } 
    public void añadirALPrimero(String refe,long enBodega){
        if (cabeza1==null) {
            cabeza1=new Nodo4_num1(refe,enBodega);

        }else{
            Nodo4_num1 temp=cabeza1;
            Nodo4_num1 nuevo=new Nodo4_num1(refe,enBodega);
            nuevo.enlazarSiguiente(temp);
            this.cabeza1=nuevo;
        }
        size++;
    }
    
        public void mostrar(){
        int i=1;
        Nodo4_num1 aux=this.cabeza1;
        while (aux!=null) {
            System.out.println("Articulo #"+i);
            System.out.println("[Referencia: "+aux.refe+"]");
            System.out.println("[En Bodega: "+aux.enBodega+"]");
     
            System.out.println("");
            aux=aux.siguiente;
            i++;
        }
        if (cabeza1==null) {
            i=1;
        }
    }
        
    public void actualizar(lista4_num2 lista2){
        Nodo4_num1 tempo=this.cabeza1;
        for (int i = 0; i < this.size; i++) {
            Nodo4_num1 nodo4_num1=this.obtener(i);
            String ref = nodo4_num1.refe;
            for (int j = 0; j < lista2.size; j++) {
                Nodo4_num2 nodo4_num2 = lista2.obtener(j);
                if(nodo4_num2.refe==ref){
                    nodo4_num1.enBodega-=nodo4_num2.enVenta;
                }
            }
        }
    }
    
     public Nodo4_num1 obtener(int index){
        int con=0;
        Nodo4_num1 temporal=this.cabeza1;
        while (con!=index) {            
            temporal=temporal.siguiente;
            con++;
        }
        return temporal;
    }
}
