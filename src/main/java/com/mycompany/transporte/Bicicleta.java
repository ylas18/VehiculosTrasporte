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
public class Bicicleta extends Vehiculo{
  private int engranaje;

    public int getEngranaje() {
        return engranaje;
    }

    public void setEngranaje(int engranaje) {
        this.engranaje = engranaje;
    }
 
    public Bicicleta(String marca, int modelo, int engranaje) {
        super(marca, modelo);
        this.engranaje= engranaje;
    }
   
     
  public Bicicleta(){
      super();
      engranaje=0;
      
          }
    
    public void imprimirBicicleta(){
        
       Inicio ini = new Inicio();
       ArrayList<Vehiculo>ListaVehiculo = ini.traerVehiculo();
       System.out.println("Lista de Bicicletas.");
      
        for (Vehiculo listaBicicleta : ListaVehiculo) {
            if(listaBicicleta instanceof Bicicleta  ){
               Bicicleta x;
                x = ((Bicicleta)listaBicicleta);
            System.out.println("Modelo: "+x.getModelo()+" Marca: "+x.getMarca()+" Engranaje: "+x.getEngranaje());   
           
            }   
            }
           
        }
    
}
