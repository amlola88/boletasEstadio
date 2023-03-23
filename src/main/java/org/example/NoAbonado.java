package org.example;

public class NoAbonado extends Cliente{

    private String tipoBoleta;

    private Integer cantidadBoletasNoAbonado = 5;

    public NoAbonado() {
    }

    public NoAbonado(String nombre,
                     String cedula,
                     String celular,
                     String correo,
                     String direccion,
                     String tipoBoleta,
                     Integer cantidadBoletasNoAbonado) {
        super(nombre, cedula, celular, correo, direccion);
        this.tipoBoleta = tipoBoleta;
        this.cantidadBoletasNoAbonado = cantidadBoletasNoAbonado;
    }

    public String getTipoBoleta() {
        return tipoBoleta;
    }

    public void setTipoBoleta(String tipoBoleta) {
        this.tipoBoleta = tipoBoleta;
    }

    public Integer getCantidadBoletasNoAbonado() {
        return cantidadBoletasNoAbonado;
    }

    public void setCantidadBoletasNoAbonado(Integer cantidadBoletasNoAbonado) {
        this.cantidadBoletasNoAbonado = cantidadBoletasNoAbonado;
    }
}
