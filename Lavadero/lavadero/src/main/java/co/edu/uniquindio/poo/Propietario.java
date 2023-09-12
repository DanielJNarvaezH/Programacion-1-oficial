package co.edu.uniquindio.poo;

public class Propietario {
    private String nombre;
    private String numeroContacto;
    private String email;

    public Propietario(){

    }

    public Propietario(String nombre, String numeroContacto, String email) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.email = email;
        assert nombre != null;
        assert numeroContacto != null;
        assert email != null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", numeroContacto=" + numeroContacto + ", email=" + email + "]";
    }
    
}

