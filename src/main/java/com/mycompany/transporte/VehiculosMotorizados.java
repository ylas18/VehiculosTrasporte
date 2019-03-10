/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transporte;

import java.util.ArrayList;

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
     public VehiculosMotorizados(){
    
    }
      public void imprimirVehiculoMotorizados(){
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        System.out.println("Lista de Vehiculos Motorizados.");
        for (Vehiculo listaVehiculos : ListaVehiculo) {
            if (listaVehiculos instanceof Jet) {
                Jet x;
                x = ((Jet) listaVehiculos);
                System.out.println("Modelo: " + x.getModelo() + " Marca: " + x.getMarca() + " Motores: " + x.getMotores());
            }else if (listaVehiculos instanceof Carro){
                Carro x;
                x = ((Carro) listaVehiculos);
                System.out.println("Modelo: " + x.getModelo() + " Marca: " + x.getMarca() + " Tamaño: " + x.getTamaño());
            }
        }
}
}
    

