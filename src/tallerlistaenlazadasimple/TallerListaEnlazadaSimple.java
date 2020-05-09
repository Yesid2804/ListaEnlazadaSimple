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
        int opcion=1,num;
        String seguir;
        Scanner entrada = new Scanner(System.in);
        ListaEjercicio1 lEjercicio1=new ListaEjercicio1();

        while(opcion!=0){
            System.out.println("**********MENU DE EJERCICIOS**********");
            System.out.println("1- Ejercicio 1");
            System.out.println("2- Ejercicio 2");
            System.out.println("3- Ejercicio 3");
            System.out.println("4- Ejercicio 4");
            System.out.println("5- Ejercicio 5");
            System.out.println("6- Ejercicio 6");
            System.out.println("7- Ejercicio 7");

            System.out.println("0- Salir");
            opcion= entrada.nextInt();


            if(opcion==1){
                System.out.println("Ejercicio #1");
                int op=0,cont=1;
                while(op!=3){
                    System.out.println("**********Menu Principal**********");
                    System.out.println("1.- Registrar Información de Inventario");
                    System.out.println("2.- Gestión de Inventario");
                    System.out.println("3.- Fin de la Aplicación");
                    op=entrada.nextInt();
                    if (op==1) {
                        NodoMedicamento nodoMedicamento = lEjercicio1.crearNodo();
                        lEjercicio1.añadirALPrimero(nodoMedicamento);
                    }
                    if (op==2) {
                        int opSub=1;
                        while (opSub!=0) {          
                            if (!lEjercicio1.estaVacia()) {
                                System.out.println("**********Submenu Gestion de Inventario**********");
                                System.out.println("1-Actualizar Info. De Inventario");
                                System.out.println("2-Borrar Registro de Inventario");
                                System.out.println("3-Consulta Información de Inventario");
                                System.out.println("4-Informe de Inventarios");
                                System.out.println("0-Retornar al Menu Principal");
                                opSub=entrada.nextInt();
                                if (opSub==1) {
                                    String refMedicamento;
                                    lEjercicio1.mostrarRegistro();
                                    System.out.println("Cual Medicamento desea actualizar?");
                                    System.out.println("Indiquelo por la referencia del Medicamento");
                                    refMedicamento=entrada.next();
                                    
                                    if(!lEjercicio1.buscarPorReferencia(refMedicamento)){
                                        System.out.println("La referencia no existe");
                                    }else{
                                        lEjercicio1.actualizarInformacioInventario(refMedicamento);    
                                    }
                                }
                                if (opSub==2) {
                                    String refMedicamento;
                                    lEjercicio1.mostrarRegistro();
                                    System.out.println("Cual Medicamento desea eliminar?");
                                    System.out.println("Indiquelo por la referencia del Medicamento");
                                    refMedicamento=entrada.next();
                                    lEjercicio1.retirarPorReferencia(refMedicamento);
                                    lEjercicio1.mostrarRegistro();
                                }
                                if (opSub==3) {
                                    lEjercicio1.mostrarRegistro();
                                }
                                if (opSub==4) {
                                    System.out.print("La cantidad de Medicamentos registrados es de"+ lEjercicio1.size);
                                }
                                if (opSub!=0) {
                                    System.out.println("");
                                    Scanner Entrada = new Scanner(System.in);
                                    System.out.println("Press Enter key to continue...");
                                    try{
                                        seguir = Entrada.nextLine();
                                    }
                                    catch(Exception e){}
                                }
                               
                            }else{
                                System.out.println("No se encuentra Informacion registrada");
                                opSub=0;
                            }
                        }

                    }
                    cont++;
                }
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
               System.out.println("Presiona Enter para continar...");
               try{seguir = Entrada.nextLine();
               menu();}
               catch(Exception e){}
            }

            if(opcion==3){
                System.out.println("Ejercicio #3");
                ListaEjercicio3 miLista3=new ListaEjercicio3();
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
                System.out.println("Presiona Enter para continar...");
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
                lista5_num1 listaNum1=new lista5_num1();
                System.out.println("---Lista de Ejemplo 1---");
                listaNum1.añadirALPrimero("1959",279);
                listaNum1.añadirALPrimero("791",759);
                listaNum1.añadirALPrimero("22119",550);
                listaNum1.añadirALPrimero("89135",1780);
                listaNum1.mostrar();
                
                lista5_num2 listaNum2=new lista5_num2();
                System.out.println("---Lista de Ejemplo 2----");
                listaNum2.añadirALPrimero("2299",210);
                listaNum2.añadirALPrimero("22119",121);
                listaNum2.añadirALPrimero("791",180);
                listaNum2.añadirALPrimero("88334",456);
                listaNum2.mostrar();
                
                listaNum1.actualizar(listaNum2);
                
                listaNum1.mostrar();
                
                System.out.println("");
                Scanner Entrada = new Scanner(System.in);
                System.out.println("Presiona Enter para continar...");
                try{seguir = Entrada.nextLine();
                menu();}
                catch(Exception e){}
            }
            if(opcion==6){
                Lista6_num1 listaNum1=new Lista6_num1();
                System.out.println("*****Lista de Ejemplo 1*****");
                listaNum1.añadirALPrimero(4);
                listaNum1.añadirALPrimero(3);
                listaNum1.añadirALPrimero(2);
                listaNum1.añadirALPrimero(1);
                listaNum1.mostrar();
                
                System.out.println("");
                Lista6_num2 listaNum2=new Lista6_num2();
                System.out.println("*****Lista de Ejemplo 2*****");
                listaNum2.añadirALPrimero(3);
                listaNum2.añadirALPrimero(5);
                listaNum2.añadirALPrimero(2);
                listaNum2.añadirALPrimero(7);
                listaNum2.mostrar();
                
                listaNum1.retirarRepetidos(listaNum2);
                System.out.println("");
                System.out.println("*****Lista de Ejemplo 1 nuevo*****");
                listaNum1.mostrar();

                System.out.println("");
                Scanner Entrada = new Scanner(System.in);
                System.out.println("Presiona Enter para continar...");
                try{seguir = Entrada.nextLine();
                menu();}
                catch(Exception e){}
            }
            if(opcion==7){

            }
            if(opcion==-1){
                System.exit(0);
            }
        }
    }
}
