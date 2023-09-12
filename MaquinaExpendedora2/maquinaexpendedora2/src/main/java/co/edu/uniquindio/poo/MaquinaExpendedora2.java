package co.edu.uniquindio.poo;

public class MaquinaExpendedora2 {

    private int valorPagar; 
    private int ValorPagado;

    public MaquinaExpendedora2(){

    }

    public MaquinaExpendedora2(int valorPagar, int valorPagado) {
        this.valorPagar = valorPagar;
        this.ValorPagado = valorPagado;
    }

    public int CalcularDevuelta(){
        int devuelta = 0;
        devuelta = valorPagar-ValorPagado;
        return devuelta;
    }
    public int validarValoresPositivos(){
    if (valorPagar<0 || ValorPagado<0){
        throw new IllegalArgumentException("No se puede hacer con valores negativos");
    }
    else {
        return 0;
    }
   }
   public int pagadoDebeSerMayor(){
    if (valorPagar > ValorPagado){
        throw new IllegalArgumentException("Valor Pagado debe ser mayor a Valor a Pagar");
    }
    else{
        return 0;
    }
   }

}

