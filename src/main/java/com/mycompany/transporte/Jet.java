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
public class Jet extends VehiculosMotorizados{
    private int motores;

    public Jet(String marca, int modelo, String combustible,int motores) {
        super(marca, modelo, combustible);
        this.motores=motores;
    }
    public Jet() {
        super();
        motores = 0;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }
    public void imprimirJet() {

        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        System.out.println("Lista de Jets.");
        for (Vehiculo listaJet : ListaVehiculo) {
            if (listaJet instanceof Jet) {
                Jet x;
                x = ((Jet) listaJet);
                System.out.println("Marca: "+x.getMarca()+" Modelo: "+x.getModelo()+ " Motores: " + x.getMotores());

            }
        }

    }
    @Override
    public void buscarModeloNuevo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        for (Vehiculo listaJets : ListaVehiculo) {
            if (listaJets instanceof Jet) {
                Jet x;
                x = ((Jet) listaJets);
                if (x.getModelo() > 2000) {
                    System.out.println("Jet mas Nuevo: "+"Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Motores: " + x.getMotores());
                }
            }
        }
    }
    
    @Override
    public void buscarModeloAntiguo() {
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        for (Vehiculo listaJets : ListaVehiculo) {
            if (listaJets instanceof Jet) {
                Jet x;
                x = ((Jet) listaJets);
                if (x.getModelo() <= 2000) {
                    System.out.println("Jet mas Antiguo: "+"Marca: " + x.getMarca() + " Modelo: " + x.getModelo() + " Motores: " + x.getMotores());
                }
            }
        }
    }
}
