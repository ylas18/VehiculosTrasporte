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
public class Patineta extends Vehiculo {
    private int longitud;

    public Patineta(String marca, int modelo, int longitud) {
        super(marca, modelo);
        this.longitud=longitud;
    }
    
    
}
