/**
 * Clase creada a partir de un diagrama de clases
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 * */

package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ComercioTest {
    
    @Test
    public void crearComercio(){
        Marca marca1 = new Marca("CocaCola", "www.cocacola/coconuts/cocaNelo.com", "cocacola123@hotmail.com");
        Producto producto1 = new Producto("CocaNelo", LocalDate.of(2022, 10, 8), 15000, marca1, TipoProducto.NACIONAL);

        System.out.println(producto1.toString());

        assertEquals("CocaCola",producto1.getMarca().getNombre());


    }
}
