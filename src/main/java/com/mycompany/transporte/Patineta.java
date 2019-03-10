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
public class Patineta extends Vehiculo {
    private int longitud;

    public Patineta(String marca, int modelo, int longitud) {
        super(marca, modelo);
        this.longitud=longitud;
    }
    
    public Patineta() {
      super();
      longitud = 0;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
     public void imprimirPatineta() {

        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        System.out.println("Lista de Patinetas.");
        for (Vehiculo listaPatinetas : ListaVehiculo) {
            if (listaPatinetas instanceof Patineta) {
                Patineta x;
                x = ((Patineta) listaPatinetas);
                System.out.println("Modelo: " + x.getModelo() + " Marca: " + x.getMarca() + " Longitud: " + x.getLongitud());

            }
        }

    }
    
    
}
