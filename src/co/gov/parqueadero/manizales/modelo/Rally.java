/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Rally extends Competencia implements Serializable
{
    private String nombreCopiloto;

    public Rally(String nombreCopiloto, String escuderia, String numeroChasis, String color, String numeroMotor) 
    {
        super(escuderia, numeroChasis, color, numeroMotor);
        this.nombreCopiloto = nombreCopiloto;
    }

    public String getNombreCopiloto() 
    {
        return nombreCopiloto;
    }

    public void setNombreCopiloto(String nombreCopiloto) 
    {
        this.nombreCopiloto = nombreCopiloto;
    }

    @Override
    public String toString() 
    {
        return "Rally{" + "nombreCopiloto=" + nombreCopiloto + '}';
    }
    
    
}
