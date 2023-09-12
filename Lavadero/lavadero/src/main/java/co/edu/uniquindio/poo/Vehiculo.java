package co.edu.uniquindio.poo;

public class Vehiculo {
    private String placa;
    private Propietario propietario;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo(){

    }

    public Vehiculo(String placa, Propietario propietario, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.propietario = propietario;
        this.tipoVehiculo = tipoVehiculo;
        assert placa != null;
        assert propietario != null;
        assert tipoVehiculo != null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", propietario=" + propietario + ", tipoVehiculo=" + tipoVehiculo + "]";
    }

    
    
}
