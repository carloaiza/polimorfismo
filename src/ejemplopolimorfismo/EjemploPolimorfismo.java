/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import co.gov.parqueadero.manizales.modelo.Avion;
import co.gov.parqueadero.manizales.modelo.Camion;
import co.gov.parqueadero.manizales.modelo.Taxi;
import co.gov.parqueadero.manizales.modelo.TransporteCarga;
import co.gov.parqueadero.manizales.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author carloaiza
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Vehiculo> listadoVehiculos= new ArrayList<>();
        
        Camion micamioncito= new Camion((byte)4,"MI transportadora",true,12, 
                "Furgón", "WAE345", "2344434554", "Blanco", "3453543");        
        Taxi mitaxi= new Taxi(10000000, "Local", (short)4, 1.2f, 
                "Sedan", "WAD423", "25252762", "Amarillo", "56756757");
        listadoVehiculos.add(mitaxi);
        listadoVehiculos.add(micamioncito);        
        for(Vehiculo veh:listadoVehiculos)
        {
            System.out.println("veh = " + veh);
            if (veh instanceof Camion)
            {
                System.out.println(((Camion)veh).getNumeroEjes());
            }
        }
        
        
    }
    
}
