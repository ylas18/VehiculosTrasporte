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
public abstract class VehiculosMotorizados extends Vehiculo{
    private String combustible;
    
      

    public VehiculosMotorizados(String marca, int modelo,String combustible) {
        super(marca, modelo);
          this.combustible = combustible;
    }
}

    

