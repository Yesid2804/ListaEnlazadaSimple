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
public class NodoMedicamento {
    NodoMedicamento siguiente;
    String refe_Medicamento,nom_Medicamento,presentacion;
    long cant_existente,maximo,minimo;
    
    public NodoMedicamento(String refe_Medicamento, String nom_Medicamento, String presentacion, long cant_existente, long maximo, long minimo) {
        this.refe_Medicamento = refe_Medicamento;
        this.nom_Medicamento = nom_Medicamento;
        this.presentacion = presentacion;
        this.cant_existente = cant_existente;
        this.maximo = maximo;
        this.minimo = minimo;
        this.siguiente=null;
    }
    
    
}



