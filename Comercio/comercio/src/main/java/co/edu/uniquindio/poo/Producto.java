package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate fechaVencimiento;
    private int precio;
    private Marca marca;
    private TipoProducto tipoProducto;

    public Producto(){

    }

    public Producto(String nombre, LocalDate fechaVencimiento, int precio, Marca marca, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.marca = marca;
        this.tipoProducto = tipoProducto;
        assert nombre != null;
        assert fechaVencimiento != null;
        assert precio >0;
        assert marca != null;
        assert tipoProducto != null;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", fechaVencimiento=" + fechaVencimiento + ", precio=" + precio
                + ", marca=" + marca + ", tipoProducto=" + tipoProducto + "]";
    }
    
    
}
