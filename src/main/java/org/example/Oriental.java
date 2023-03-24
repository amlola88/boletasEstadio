package org.example;

public class Oriental extends Cliente {
    private Double valorBoletaOriental = 80.000;

    private Double descuentoOriental = 0.25;
    private Double valorNetoOriental;
    private Double valorDescuentoTribunaOriental;
    private Double descuentoDia;
    private Double valorIva;
    private Double totalPagarOriental;

    public Oriental() {
    }

    public Oriental(String nombre, String cedula, String celular, String correo, String direccion, Integer diaCompra, Double valorBoleta, Double valorCompra, Integer tipoTribuna, Integer cantidadBoletas, Double iva, Double valorBoletaOriental, Double descuentoOriental, Double valorNetoOriental, Double valorDescuentoTribunaOriental, Double descuentoDia, Double valorIva, Double totalPagarOriental) {
        super(nombre, cedula, celular, correo, direccion, diaCompra, valorBoleta, valorCompra, tipoTribuna, cantidadBoletas, iva);
        this.valorBoletaOriental = valorBoletaOriental;
        this.descuentoOriental = descuentoOriental;
        this.valorNetoOriental = valorNetoOriental;
        this.valorDescuentoTribunaOriental = valorDescuentoTribunaOriental;
        this.descuentoDia = descuentoDia;
        this.valorIva = valorIva;
        this.totalPagarOriental = totalPagarOriental;
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

    public Double getValorNetoOriental() {
        return valorNetoOriental;
    }

    public void setValorNetoOriental(Double valorNetoOriental) {
        this.valorNetoOriental = valorNetoOriental;
    }

    public Double getValorDescuentoTribunaOriental() {
        return valorDescuentoTribunaOriental;
    }

    public void setValorDescuentoTribunaOriental(Double valorDescuentoTribunaOriental) {
        this.valorDescuentoTribunaOriental = valorDescuentoTribunaOriental;
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

    public Double getTotalPagarOriental() {
        return totalPagarOriental;
    }

    public void setTotalPagarOriental(Double totalPagarOriental) {
        this.totalPagarOriental = totalPagarOriental;
    }

    @Override
    public Double calcularValorNeto() {
        if (this.getCantidadBoletas() > 2) {
            System.out.println("No se puede");
        }else {
            this.valorNetoOriental = this.valorBoletaOriental * this.getCantidadBoletas();
        }
        return valorNetoOriental;
    }

    @Override
    public Double calcularDescuentoTribuna() {
        this.valorDescuentoTribunaOriental = this.valorNetoOriental - (this.valorNetoOriental * this.descuentoOriental);
        return valorDescuentoTribunaOriental;
    }

    @Override
    public Double descuentoDia() {
        this.descuentoDia = this.valorNetoOriental - (this.valorNetoOriental * this.calcularDescuentoDia(2));
        return descuentoDia;
    }

    @Override
    public Double calcularIva() {
        this.valorIva = this.valorNetoOriental + (this.valorNetoOriental * this.getIva());
        return valorIva;
    }

    public Double calcularValorTotal (Double totalPagar){
        this.totalPagarOriental = this.valorNetoOriental - valorDescuentoTribunaOriental - descuentoDia + valorIva;
        return totalPagarOriental;
    }

}
