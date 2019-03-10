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
        this.longitud = longitud;
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
                System.out.println("Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Longitud: " + x.getLongitud());

            }
        }

    }

    @Override
    public void buscarModeloNuevo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        for (Vehiculo listaPatinetas : ListaVehiculo) {
            if (listaPatinetas instanceof Patineta) {
                Patineta x;
                x = ((Patineta) listaPatinetas);
                if (x.getModelo() > 2000) {
                    System.out.println("Patineta mas Nueva: "+"Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Longitud: " + x.getLongitud());
                } 
            }
        }
    }
    
    @Override
    public void buscarModeloAntiguo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        for (Vehiculo listaPatinetas : ListaVehiculo) {
            if (listaPatinetas instanceof Patineta) {
                Patineta x;
                x = ((Patineta) listaPatinetas);
                if (x.getModelo() <= 2000) {
                    System.out.println("Patineta mas Antigua: "+"Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Longitud: " + x.getLongitud());
                }
                
            }
        }
    }

}
