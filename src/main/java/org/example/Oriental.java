package org.example;

public class Oriental extends Cliente {
    private Double valorBoletaOriental = 80.000;

    private Double descuentoOriental = 0.25;

    private Integer cantidadBoletasOriental = 2;

    public Oriental() {
    }

    public Oriental(String nombre,
                    String cedula,
                    String celular,
                    String correo,
                    String direccion,
                    Double valorBoletaOriental,
                    Double descuentoOriental,
                    Integer cantidadBoletasOriental) {
        super(nombre, cedula, celular, correo, direccion);
        this.valorBoletaOriental = valorBoletaOriental;
        this.descuentoOriental = descuentoOriental;
        this.cantidadBoletasOriental=cantidadBoletasOriental;
    }

    public Double getValorBoletaOriental() {
        return valorBoletaOriental;
    }

    public void setValorBoletaOriental(Double valorBoletaOriental) {
        this.valorBoletaOriental = valorBoletaOriental;
    }

    public Double getDescuentoOriental() {
        return descuentoOriental;
    }

    public void setDescuentoOriental(Double descuentoOriental) {
        this.descuentoOriental = descuentoOriental;
    }

    public Integer getCantidadBoletasOriental() {
        return cantidadBoletasOriental;
    }

    public void setCantidadBoletasOriental(Integer cantidadBoletasOriental) {
        this.cantidadBoletasOriental = cantidadBoletasOriental;
    }
}
