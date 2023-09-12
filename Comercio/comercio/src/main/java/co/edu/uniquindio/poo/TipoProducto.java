package co.edu.uniquindio.poo;

public enum TipoProducto {
    NACIONAL("NACIONAL"), IMPORTADO("IMPORTADO");

    String tipo;

    private TipoProducto(String tipo){
        this.tipo = tipo;
    }
}
