package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class RegistroLavado {
    double costo;
    LocalDate fechaIngreso;
    String horaIngreso;
    LocalDate fechaSalida;
    String horaSalida;
    Vehiculo vehiculo;
    TipoLavado tipoLavado;

    public RegistroLavado(){

    }

    public RegistroLavado(double costo, LocalDate fechaIngreso, String horaIngreso, LocalDate fechaSalida,
            String horaSalida, Vehiculo vehiculo, TipoLavado tipoLavado) {
        this.costo = costo;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        this.tipoLavado = tipoLavado;
        assert costo >=0;
        assert fechaIngreso != null;
        assert horaIngreso != null;
        assert fechaSalida != null;
        assert horaSalida != null;
        assert vehiculo != null;
        assert tipoLavado != null;

    }

    public double calcularCostoLavado(TipoVehiculo tipoVehiculo){

        costo = 0;
        
        switch (tipoVehiculo){

            case CARRO:{

                switch (tipoLavado){

                    case  SIMPLE:{

                        costo = 30000;
                        break;

                    }
                    case POLICHADO:{

                        costo = 45000;
                        break;

                    }
                    case DELUX:{

                        costo = 60000;
                        break;

                    }

                }

                break;

            }

            case CAMIONETA:{

                switch (tipoLavado){

                    case  SIMPLE:{

                        costo = 40000;
                        break;

                    }
                    case POLICHADO:{

                        costo = 60000;
                        break;

                    }
                    case DELUX:{

                        costo = 80000;
                        break;

                    }

                }

                break;

            }

            case MOTO:{

                switch (tipoLavado){

                    case  SIMPLE:{

                        costo = 10000;
                        break;

                    }
                    case POLICHADO:{

                        costo = 15000;
                        break;

                    }
                    case DELUX:{

                        costo = 20000;
                        break;

                    }

                }

                break;

            }


      }

        return costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public TipoLavado getTipoLavado() {
        return tipoLavado;
    }

    public void setTipoLavado(TipoLavado tipoLavado) {
        this.tipoLavado = tipoLavado;
    }

    @Override
    public String toString() {
        return "RegistroLavadero [costo=" + costo + ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso
                + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", vehiculo=" + vehiculo
                + ", tipoLavado=" + tipoLavado + "]";
    }

    
}

