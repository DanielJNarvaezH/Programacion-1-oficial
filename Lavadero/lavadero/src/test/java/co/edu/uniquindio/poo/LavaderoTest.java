package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class LavaderoTest {

    @Test
    public void crearLavadero(){

        
        Propietario propietario1 = new Propietario("Tarzán", "34523082", "gneltreinQhotmail.com");
        Vehiculo vehiculo1 = new Vehiculo("asdc2031", propietario1, TipoVehiculo.CAMIONETA);
        RegistroLavado registro1 = new RegistroLavado(0, LocalDate.of(2023, 9, 10), "3:45", LocalDate.of(2023, 9, 10), "6:45", vehiculo1 ,TipoLavado.POLICHADO);
        Lavadero lavadero1 = new Lavadero("LavaMax", "123.435-8", registro1);

        registro1.calcularCostoLavado(vehiculo1.getTipoVehiculo());

        System.out.println("El costo del lavado dadas las elecciones es de:" + lavadero1.getRegistroLavado().getCosto());
        assertEquals("34523082",lavadero1.getRegistroLavado().getVehiculo().getPropietario().getNumeroContacto());
    }
    


}
