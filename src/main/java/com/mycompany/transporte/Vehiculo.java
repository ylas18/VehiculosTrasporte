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
        Inicio ini = new Inicio();
        ArrayList<Vehiculo> ListaVehiculo = ini.traerVehiculo();
        System.out.println("Lista de Vehiculos.");
        for (Vehiculo listaVehiculos : ListaVehiculo) {
            if (listaVehiculos instanceof Jet) {
                Jet x;
                x = ((Jet) listaVehiculos);
                System.out.println("Modelo: " + x.getModelo() + " Marca: " + x.getMarca() + " Motores: " + x.getMotores());
            }else if (listaVehiculos instanceof Carro){
                Carro x;
                x = ((Carro) listaVehiculos);
                System.out.println("Modelo: " + x.getModelo() + " Marca: " + x.getMarca() + " Tamaño: " + x.getTamaño());
            }else if(listaVehiculos instanceof Bicicleta){
                Bicicleta x;
                x = ((Bicicleta) listaVehiculos);
                System.out.println("Modelo: " + x.getModelo() + " Marca: " + x.getMarca() + " Engranaje: " + x.getEngranaje());
            }else if(listaVehiculos instanceof Patineta){
                Patineta x;
                x = ((Patineta) listaVehiculos);
                System.out.println("Modelo: " + x.getModelo() + " Marca: " + x.getMarca() + " Longitud: " + x.getLongitud());

             }
        }
    }

    
}
