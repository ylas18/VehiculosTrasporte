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
public class Principal {
    public static void main(String[] args) {
     
      Bicicleta bici= new Bicicleta();
      bici.imprimirBicicleta();
      
      Carro carro =new Carro();
      carro.imprimirCarro();
      
      Jet jet =new Jet();
      jet.imprimirJet();
           
      Patineta pati = new Patineta();
      pati.imprimirPatineta();
      
      carro.imprimirVehiculo();
      carro.imprimirVehiculoMotorizados();
      
      bici.buscarModeloAntiguo();
      bici.buscarModeloNuevo();
      
      carro.buscarModeloAntiguo();
      carro.buscarModeloNuevo();
      
      jet.buscarModeloAntiguo();
      jet.buscarModeloNuevo();
      
      pati.buscarModeloAntiguo();
      pati.buscarModeloNuevo();
      

    }
}
