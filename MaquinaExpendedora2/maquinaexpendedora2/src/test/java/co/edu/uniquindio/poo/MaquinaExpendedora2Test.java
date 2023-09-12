
    /**
 * Clase para probar el funcionamiento de un código mediante excepciones
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class MaquinaExpendedora2Test {
    @Test
    public void crearExpendedora() {
        MaquinaExpendedora2 test = new MaquinaExpendedora2(120, 200);
        int devuelta = test.CalcularDevuelta();
 
        assertThrows(IllegalArgumentException.class, () -> {
            test.pagadoDebeSerMayor();
        }, "Se esperaba una excepción de tipo IllegalArgumentException y no se recibió nada");
        
        assertThrows(IllegalArgumentException.class, () -> {
            test.validarValoresPositivos();
        }, "La validación de valores negativos no se lanzó como se esperaba");

        assertEquals(80, devuelta);

    }
}

