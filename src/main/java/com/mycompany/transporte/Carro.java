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
public class Carro extends VehiculosMotorizados {

    private int tamaño;

    public Carro(String marca, int modelo, String combustible, int tamaño) {
        super(marca, modelo, combustible);
        this.tamaño = tamaño;
    }

    public Carro() {
        super();
        tamaño = 0;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void imprimirCarro() {

        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        System.out.println("Lista de Carros.");
        for (Vehiculo listaCarro : ListaVehiculo) {
            if (listaCarro instanceof Carro) {
                Carro x;
                x = ((Carro) listaCarro);
                System.out.println("Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Capacidad: " + x.getTamaño());

            }
        }

    }

    @Override
    public void buscarModeloNuevo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        for (Vehiculo listaCarros : ListaVehiculo) {
            if (listaCarros instanceof Carro) {
                Carro x;
                x = ((Carro) listaCarros);
                if (x.getModelo() > 2000) {
                    System.out.println("Carros mas nuevos: " + "Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Capacidad: " + x.getTamaño());
                }
            }
        }
    }

    @Override
    public void buscarModeloAntiguo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        for (Vehiculo listaCarros : ListaVehiculo) {
            if (listaCarros instanceof Carro) {
                Carro x;
                x = ((Carro) listaCarros);
                if (x.getModelo() <= 2000) {
                    System.out.println("Carro mas Antiguo: "+"Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Capacidad: " + x.getTamaño());
                }
            }
        }
    }
}


