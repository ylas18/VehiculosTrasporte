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
public abstract class Vehiculo implements ITransporte{
    
    private String marca;
    private int modelo;

    public Vehiculo(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Vehiculo(){
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void imprimirVehiculo(){
    }
    
    
    
    
}
