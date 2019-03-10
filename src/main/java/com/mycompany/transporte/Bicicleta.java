/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transporte;

import static com.oracle.nio.BufferSecrets.instance;
import java.util.ArrayList;

/**
 *
 * @author Yesid Avila
 */
public class Bicicleta extends Vehiculo {

    private int engranaje;

    public int getEngranaje() {
        return engranaje;
    }

    public void setEngranaje(int engranaje) {
        this.engranaje = engranaje;
    }

    public Bicicleta(String marca, int modelo, int engranaje) {
        super(marca, modelo);
        this.engranaje = engranaje;
    }

    public Bicicleta() {
        super();
        engranaje = 0;

    }

    public void imprimirBicicleta() {

        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        System.out.println("Lista de Bicicletas.");

        for (Vehiculo listaBicicleta : ListaVehiculo) {
            if (listaBicicleta instanceof Bicicleta) {
                Bicicleta x;
                x = ((Bicicleta) listaBicicleta);
                System.out.println("Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Engranaje: " + x.getEngranaje());

            }
        }

    }

    @Override
    public void buscarModeloNuevo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();

        for (Vehiculo listaBicicletas : ListaVehiculo) {
            if (listaBicicletas instanceof Bicicleta) {
                Bicicleta x;
                x = ((Bicicleta) listaBicicletas);
                if (x.getModelo() > 2000) {

                    System.out.println("Bicicleta mas Nueva: " + "Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Engranaje: " + x.getEngranaje());
                }
            }
        }
    }

    @Override
    public void buscarModeloAntiguo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();

        for (Vehiculo listaBicicletas : ListaVehiculo) {
            if (listaBicicletas instanceof Bicicleta) {
                Bicicleta x;
                x = ((Bicicleta) listaBicicletas);
                if (x.getModelo() <= 2000) {

                    System.out.println("Bicicleta mas Antigua: " + "Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Engranaje: " + x.getEngranaje());
                }
            }
        }
    }
}
