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
public class Inicio {
   
     
     ArrayList<Vehiculo> listaVehiculo =new ArrayList<Vehiculo>();
    
       public ArrayList<Vehiculo> traerVehiculo(){
          Bicicleta cicla1= new Bicicleta("Shimano", 2000,26);
          Bicicleta cicla2= new Bicicleta("BMX", 2012,1);
          Bicicleta cicla3= new Bicicleta("Giant", 2010,28);
          
          Carro carro1= new Carro("Mazda",1990 , "Gasolina", 5);
          Carro carro2 = new Carro("Renault", 2013, "Gas", 7);
          Carro carro3 = new Carro("BMW", 2018, "Electrico", 2);
          
          Jet jet1 = new Jet("Airbus", 2000,"Gasolina",2);
          Jet jet2 = new Jet("Bombardier", 2008,"Gasolina",1);
          Jet jet3 = new Jet("Cessna", 2015,"Gasolina",3);
          
          Patineta tabla1 = new Patineta("Planb", 2000, 60);
          Patineta tabla2 = new Patineta("Zero", 2015, 58);
          Patineta tabla3 = new Patineta("One", 2014, 62);
          
          listaVehiculo.add(cicla1);
          listaVehiculo.add(cicla2);
          listaVehiculo.add(cicla3);
          listaVehiculo.add(carro1);
          listaVehiculo.add(carro2);
          listaVehiculo.add(carro3);
          listaVehiculo.add(jet1);
          listaVehiculo.add(jet2);
          listaVehiculo.add(jet3);
          listaVehiculo.add(tabla1);
          listaVehiculo.add(tabla2);
          listaVehiculo.add(tabla3);
          
          return listaVehiculo;
          
          

           
           
}

    
}
