/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transporte;

/**
 *
 * @author Yesid Avila
 */
public class Jet extends VehiculosMotorizados{
    private int motores;

    public Jet(String marca, int modelo, String combustible,int motores) {
        super(marca, modelo, combustible);
        this.motores=motores;
    }
    
}
