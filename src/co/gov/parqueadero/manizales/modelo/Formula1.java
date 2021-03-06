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
   private String  numero;

    public Formula1(String numero, String escuderia, String numeroChasis, String color, String numeroMotor)
    {
        super(escuderia, numeroChasis, color, numeroMotor);
        this.numero = numero;
    }

    public String getNumero() 
    {
        return numero;
    }

    public void setNumero(String numero) 
    {
        this.numero = numero;
    }

    @Override
    public String toString() 
    {
        return "Formula1{" + "numero=" + numero + '}';
    }   
}
