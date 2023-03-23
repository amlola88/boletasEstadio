package org.example;

public class Occidental extends Cliente{

    private Double valorBoletaOccidental = 150.000;

    private Double descuentoOccidental = 0.15;

    private Integer cantidadBoletasOccidental = 3;

    public Occidental() {
    }

    public Occidental(String nombre,
                      String cedula,
                      String celular,
                      String correo,
                      String direccion,
                      Double valorBoletaOccidental,
                      Double descuentoOccidental,
                      Integer cantidadBoletasOccidental) {
        super(nombre, cedula, celular, correo, direccion);
        this.valorBoletaOccidental = valorBoletaOccidental;
        this.descuentoOccidental = descuentoOccidental;
        this.cantidadBoletasOccidental=cantidadBoletasOccidental;
    }

    public Double getValorBoletaOccidental() {
        return valorBoletaOccidental;
    }

    public void setValorBoletaOccidental(Double valorBoletaOccidental) {
        this.valorBoletaOccidental = valorBoletaOccidental;
    }

    public Double getDescuentoOccidental() {
        return descuentoOccidental;
    }

    public void setDescuentoOccidental(Double descuentoOccidental) {
        this.descuentoOccidental = descuentoOccidental;
    }

    public Integer getCantidadBoletasOccidental() {
        return cantidadBoletasOccidental;
    }

    public void setCantidadBoletasOccidental(Integer cantidadBoletasOccidental) {
        this.cantidadBoletasOccidental = cantidadBoletasOccidental;
    }
}
