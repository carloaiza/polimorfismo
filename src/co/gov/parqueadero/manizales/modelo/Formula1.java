/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author AndrésO
 */
public class Formula1 extends Competencia implements Serializable
{
   private String  numeroVehiculo;
    private String nombre;

    public Formula1(String numeroVehiculo, String nombre, String numero, String escuderia, String numeroChasis, String color, String numeroMotor) 
    {
        super(escuderia, numeroChasis, color, numeroMotor);
        this.numeroVehiculo = numeroVehiculo;
        this.nombre = nombre;
    }

    public String getNumeroVehiculo() {
        return numeroVehiculo;
    }
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }    

    }

    public void setNumeroVehiculo(String numeroVehiculo) {
        this.numeroVehiculo = numeroVehiculo;
    }

    @Override
    public String toString() {
        return "Formula1{" + "numeroVehiculo=" + numeroVehiculo + "nombre:"+this.nombre+'}';
    }

   
}
