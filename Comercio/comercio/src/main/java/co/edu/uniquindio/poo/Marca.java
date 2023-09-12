package co.edu.uniquindio.poo;

public class Marca {
    private String nombre;
    private String web;
    private String email;

    public Marca(){

    }

    public Marca(String nombre, String web, String email) {
        this.nombre = nombre;
        this.web = web;
        this.email = email;
        assert nombre != null;
        assert web != null;
        assert email != null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Marca [nombre=" + nombre + ", web=" + web + ", email=" + email + "]";
    }
    
}
