package co.edu.uniquindio.poo;

public class MaquinaExpendedora {
    
    /**
     * Método que sirve para determinar la devuelta teniendo en cuenta los siguientes dos parámetros
     * @param valorPagar dato int que es el valor a pagar
     * @param valorPagado dato int que es el valor pagado
     * @return retorna la devuelta
     */
    public int calcularDevuelta(int valorPagar, int valorPagado){
        assert valorPagado >= 0;
        assert valorPagar >= 0;
        assert valorPagar <= valorPagado;
        int devuelta = valorPagado - valorPagar;
        return devuelta;
    }

}
