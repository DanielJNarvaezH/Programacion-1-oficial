package co.edu.uniquindio.poo;

public class Lavadero {

    String nombre;
    String nit;
    RegistroLavado registroLavado;

    public Lavadero(){

    }

    public Lavadero(String nombre, String nit, RegistroLavado registroLavado) {
        this.nombre = nombre;
        this.nit = nit;
        this.registroLavado = registroLavado;
        assert nombre != null;
        assert nit != null;
        assert registroLavado != null;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public RegistroLavado getRegistroLavado() {
        return registroLavado;
    }

    public void setRegistroLavado(RegistroLavado registroLavado) {
        this.registroLavado = registroLavado;
    }

    @Override
    public String toString() {
        return "Lavadero [nombre=" + nombre + ", nit=" + nit + ", registroLavado=" + registroLavado + "]";
    }
    

    
    
}

