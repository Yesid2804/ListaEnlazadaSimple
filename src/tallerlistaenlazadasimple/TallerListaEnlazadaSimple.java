package tallerlistaenlazadasimple;

import java.util.Scanner;
/**
 *
 * @author Yesid
 */
public class TallerListaEnlazadaSimple {
    
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        int opcion,num;
        String seguir;
        Scanner entrada = new Scanner(System.in);
        System.out.println("**********MENU DE EJERCICIOS**********");
        System.out.println("1- Ejercicio 1");
        System.out.println("2- Ejercicio 2");
        System.out.println("3- Ejercicio 3");
        System.out.println("4- Ejercicio 4");
        System.out.println("4- Ejercicio 4");
        System.out.println("5- Ejercicio 5");
        System.out.println("6- Ejercicio 6");
        System.out.println("7- Ejercicio 7");
        
        
        System.out.println("0- Salir");
        opcion= entrada.nextInt();

        if(opcion==1){}{
      
        }
        
        if(opcion==2){
           System.out.println("Ejercicio #2");
           //Objeto de ListaEjercicio2
           ListaEjercicio2 miLista2=new ListaEjercicio2();
           //Datos ejemplos para llenar la lista
           System.out.println("-----------------Lista de Ejemplo-----------------");
           //En este caso lleno la lista agregando el Nodo al final
           miLista2.añadirALPrimero(5);
           miLista2.añadirALPrimero(4);
           miLista2.añadirALPrimero(3);
           miLista2.añadirALPrimero(2);
           miLista2.añadirALPrimero(1);

           //Muestra la lista 
           miLista2.mostrar();
           System.out.println("");
            
           System.out.println("Ingrese el valor que desea retirar de la lista mostrada en pantalla");
           num=entrada.nextInt();

           //Llama a la funcion retirar 
           miLista2.retirar(num);
           //Muestra la lista sin el valor ingresado 
           miLista2.mostrar();
           
           System.out.println("");
           Scanner Entrada = new Scanner(System.in);
           System.out.println("Press Enter key to continue...");
           try{seguir = Entrada.nextLine();
           menu();}
           catch(Exception e){}
        }
        
        if(opcion==3){
            System.out.println("Ejercicio #3");
            ListaEjercicio3 miLista3=new ListaEjercicio3();
            //En este caso lleno la lista agregando el Nodo al final
            System.out.println("-----------------Lista de Ejemplo-----------------");
            miLista3.añadirALPrimero(1);
            miLista3.añadirALPrimero(1);
            miLista3.añadirALPrimero(3);
            miLista3.añadirALPrimero(4);
            miLista3.añadirALPrimero(3);
            miLista3.añadirALPrimero(5);
            miLista3.añadirALPrimero(1);
            

            miLista3.mostrar();
            System.out.println("");
            miLista3.encotrarRepetidos();
            miLista3.mostrar();

            
            Scanner Entrada = new Scanner(System.in);
            System.out.println("Press Enter key to continue...");
            try{seguir = Entrada.nextLine();
            menu();}
            catch(Exception e){}
        }
        
        if(opcion==4){
            String nombre="";int cont=1;
            System.out.println("Ejercicio #4");
            ListaEjercicio4 lista4=new  ListaEjercicio4();
            System.out.println("");
            System.out.println("Ingrese n para finalizar");
            System.out.println("Ingrese los nombres a la lista");
            while (!nombre.equals("n")) {                
                System.out.print(cont+"- ");  
                nombre=entrada.next();
                if(!nombre.equals("n")){
                    if (!lista4.buscarDato(nombre)) {
                        lista4.añadirALPrimero(nombre);
                        cont++;
                    }else{
                        System.out.println("Esta repetido");
                    }
                }
            }
            lista4.mostrar();
        }   
        
        if(opcion==5){
        
        }
        if(opcion==6){
        
        }
        if(opcion==7){
        
        }
        
        if(opcion==-1){
            System.exit(0);
        }
    }
}
