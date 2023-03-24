package org.example;

public class Occidental extends Cliente{

    private Double valorBoletaOccidental = 150.000;

    private Double descuentoOccidental = 0.15;
    private Double valorNetoOccidental;
    private Double valorDescuentoTribunaOccidental;
    private Double descuentoDia;
    private Double valorIva;
    private Double totalPagarOccidental;


    public Occidental() {
    }

    public Occidental(String nombre, String cedula, String celular, String correo, String direccion, Integer diaCompra, Double valorBoleta, Double valorCompra, Integer tipoTribuna, Integer cantidadBoletas, Double iva, Double valorBoletaOccidental, Double descuentoOccidental, Double valorNetoOccidental, Double valorDescuentoTribunaOccidental, Double descuentoDia, Double valorIva, Double totalPagarOccidental) {
        super(nombre, cedula, celular, correo, direccion, diaCompra, valorBoleta, valorCompra, tipoTribuna, cantidadBoletas, iva);
        this.valorBoletaOccidental = valorBoletaOccidental;
        this.descuentoOccidental = descuentoOccidental;
        this.valorNetoOccidental = valorNetoOccidental;
        this.valorDescuentoTribunaOccidental = valorDescuentoTribunaOccidental;
        this.descuentoDia = descuentoDia;
        this.valorIva = valorIva;
        this.totalPagarOccidental = totalPagarOccidental;
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

    public Double getValorNetoOccidental() {
        return valorNetoOccidental;
    }

    public void setValorNetoOccidental(Double valorNetoOccidental) {
        this.valorNetoOccidental = valorNetoOccidental;
    }

    public Double getValorDescuentoTribunaOccidental() {
        return valorDescuentoTribunaOccidental;
    }

    public void setValorDescuentoTribunaOccidental(Double valorDescuentoTribunaOccidental) {
        this.valorDescuentoTribunaOccidental = valorDescuentoTribunaOccidental;
    }

    public Double getDescuentoDia() {
        return descuentoDia;
    }

    public void setDescuentoDia(Double descuentoDia) {
        this.descuentoDia = descuentoDia;
    }

    public Double getValorIva() {
        return valorIva;
    }

    public void setValorIva(Double valorIva) {
        this.valorIva = valorIva;
    }

    public Double getTotalPagarOccidental() {
        return totalPagarOccidental;
    }

    public void setTotalPagarOccidental(Double totalPagarOccidental) {
        this.totalPagarOccidental = totalPagarOccidental;
    }

    @Override
    public Double calcularValorNeto() {
        if (this.getCantidadBoletas() > 3) {
            System.out.println("No se puede");
        }else {
            this.valorNetoOccidental = this.valorBoletaOccidental * this.getCantidadBoletas();
        }
        return valorNetoOccidental;
    }

    @Override
    public Double calcularDescuentoTribuna() {
        this.valorDescuentoTribunaOccidental = this.valorNetoOccidental - (this.valorNetoOccidental * this.descuentoOccidental);
        return valorDescuentoTribunaOccidental;
    }

    @Override
    public Double descuentoDia() {
        this.descuentoDia = this.valorNetoOccidental - (this.valorNetoOccidental * this.calcularDescuentoDia(3));
        return descuentoDia;
    }

    @Override
    public Double calcularIva() {
        this.valorIva = this.valorNetoOccidental + (this.valorNetoOccidental * this.getIva());
        return valorIva;
    }

    public Double calcularValorTotal (Double totalPagar){
        this.totalPagarOccidental = this.valorNetoOccidental - valorDescuentoTribunaOccidental - descuentoDia + valorIva;
        return totalPagarOccidental;
    }


}
