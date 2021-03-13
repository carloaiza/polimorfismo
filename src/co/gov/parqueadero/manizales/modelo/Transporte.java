/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author carloaiza
 */
public class Transporte extends Vehiculo implements Serializable
{
    private float capacidad;
    private String tipoCarroceria;
    private String placa;

    public Transporte(float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) 
    {
        super(numeroChasis, color, numeroMotor);
        this.capacidad = capacidad;
        this.tipoCarroceria = tipoCarroceria;
        this.placa = placa;
    }

    
    public String getPlaca() 
    {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }
    
    public float getCapacidad() 
    {
        return capacidad;
    }

    public void setCapacidad(float capacidad) 
    {
        this.capacidad = capacidad;
    }

    public String getTipoCarroceria() 
    {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) 
    {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() 
    {
        return "Transporte{" + "capacidad=" + capacidad + ", tipoCarroceria=" + tipoCarroceria + ", placa=" + placa + '}';
    }  
}
