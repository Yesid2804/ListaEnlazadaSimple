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
public class lista5_num2 {
    Nodo5_num2 cabeza2;
    int size;

    public lista5_num2(){
        this.cabeza2=null;
        size=0;
    }
    
    public boolean estaVacia(){
        return this.cabeza2==null;
    }
    public int size(){
        return size;
    } 
    public void añadirALPrimero(String refe,long enVenta){
        if (cabeza2==null) {
            cabeza2=new Nodo5_num2(refe,enVenta);

        }else{
            Nodo5_num2 temp=cabeza2;
            Nodo5_num2 nuevo=new Nodo5_num2(refe,enVenta);
            nuevo.enlazarSiguiente(temp);
            this.cabeza2=nuevo;
        }
        size++;
    }                                                                             
    
    public void mostrar(){
        int i=1;
        Nodo5_num2 aux=this.cabeza2;
        while (aux!=null) {
            System.out.println("Articulo #"+i);
            System.out.println("[Referencia: "+aux.refe+"]");
            System.out.println("[Venta: "+aux.enVenta+"]");
     
            System.out.println("");
            aux=aux.siguiente;
            i++;
        }
        if (cabeza2==null) {
            i=1;
        }
    }
    
    public Nodo5_num2 obtener(int index){
        int con=0;
        Nodo5_num2 temporal=this.cabeza2;
        while (con!=index) {            
            temporal=temporal.siguiente;
            con++;
        }
        return temporal;
    }
        
//        public void actualizar(){
//        lista4_num2 lNum2=new lista4_num2();
//        Nodo4_num2 nodo2=new Nodo4_num2();
//        Nodo4_num1 temporal=cabeza1;
//        
//        if(cabeza1==null){
//            System.out.println("Lista vacia");
//        }else{
//            for (int i = 0; i < size; i++) {
//                System.out.println(lNum2.cabeza2);
//                temporal=temporal.siguiente;
//                
//            }
//        }
//
//    }
    
}
