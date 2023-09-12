package co.edu.uniquindio.poo;

public enum TipoVehiculo {
    MOTO("MOTO"), CARRO("CARRO"), CAMIONETA("CAMIONETA");

    private String tipo;

    private TipoVehiculo(String tipo){
        this.tipo = tipo;
    }
}
