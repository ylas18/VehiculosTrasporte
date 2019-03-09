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
public class Carro extends VehiculosMotorizados {
    private int tamaño;

    public Carro(String marca, int modelo, String combustible,int tamaño) {
        super(marca, modelo, combustible);
        this.tamaño=tamaño;
    }
    
}
