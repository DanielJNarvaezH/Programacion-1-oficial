package co.edu.uniquindio.poo;

public enum TipoLavado {
    SIMPLE("SIMPLE"), POLICHADO("POLICHADO"), DELUX("DELUX");

    private String tipo;

    private TipoLavado(String tipo){
        this.tipo = tipo;
    }
}
