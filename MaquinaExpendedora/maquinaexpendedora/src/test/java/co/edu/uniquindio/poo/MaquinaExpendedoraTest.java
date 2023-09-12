/**
 * Clase para probar el funcionamiento de un código mediante excepciones
 * @author Área de programación UQ
 * @since 2023-08
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

 package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;

public class MaquinaExpendedoraTest {
    private static final Logger LOG = Logger.getLogger(MaquinaExpendedoraTest.class.getName());

    @Test 
    public void validarResultadoCorrecto(){
        LOG.info("Inicio prueba resultado correcto");
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        assertEquals(150,maquina.calcularDevuelta(400, 550));
        LOG.info("Fin prueba resultado correcto");    
    }

    @Test
    public void validarDatosPositivos(){
        LOG.info("Inicio prueba datos positivos");
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        assertThrows(Throwable.class, ()-> maquina.calcularDevuelta(-5, -1));
        LOG.info("Fin prueba datos positivos");
    }
    @Test
    public void validarValorPagarMayor(){
        LOG.info("Inicio prueba de valor pagado menor que valor cobrado");
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        assertThrows(Throwable.class, ()-> maquina.calcularDevuelta(2150,1650));
        LOG.info("Fin prueba de valor pagado menor que valor cobrado");
    }

}

