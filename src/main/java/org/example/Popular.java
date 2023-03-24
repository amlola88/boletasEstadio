package org.example;

import java.util.Scanner;

public class Popular extends Cliente {
    private Double valorBoletaPopular = 40.000;
    private Double descuentoPopular = 0.35;
    private Double valorNetoPopular;
    private Double valorDescuentoTribunaPopular;
    private Double descuentoDia;
    private Double valorIva;
    private Double totalPagarPopular;


    public Popular() {
    }

    public Popular(String nombre, String cedula, String celular, String correo, String direccion, Integer diaCompra, Double valorBoleta, Double valorCompra, Integer tipoTribuna, Integer cantidadBoletas, Double iva, Double valorBoletaPopular, Double descuentoPopular, Double valorNetoPopular, Double valorDescuentoTribunaPopular, Double descuentoDia, Double valorIva, Double totalPagarPopular) {
        super(nombre, cedula, celular, correo, direccion, diaCompra, valorBoleta, valorCompra, tipoTribuna, cantidadBoletas, iva);
        this.valorBoletaPopular = valorBoletaPopular;
        this.descuentoPopular = descuentoPopular;
        this.valorNetoPopular = valorNetoPopular;
        this.valorDescuentoTribunaPopular = valorDescuentoTribunaPopular;
        this.descuentoDia = descuentoDia;
        this.valorIva = valorIva;
        this.totalPagarPopular = totalPagarPopular;
    }

    public Double getValorBoletaPopular() {
        return valorBoletaPopular;
    }

    public void setValorBoletaPopular(Double valorBoletaPopular) {
        this.valorBoletaPopular = valorBoletaPopular;
    }

    public Double getDescuentoPopular() {
        return descuentoPopular;
    }

    public void setDescuentoPopular(Double descuentoPopular) {
        this.descuentoPopular = descuentoPopular;
    }

    public Double getValorNetoPopular() {
        return valorNetoPopular;
    }

    public void setValorNetoPopular(Double valorNetoPopular) {
        this.valorNetoPopular = valorNetoPopular;
    }

    public Double getValorDescuentoTribunaPopular() {
        return valorDescuentoTribunaPopular;
    }

    public void setValorDescuentoTribunaPopular(Double valorDescuentoTribunaPopular) {
        this.valorDescuentoTribunaPopular = valorDescuentoTribunaPopular;
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

    public Double getTotalPagarPopular() {
        return totalPagarPopular;
    }

    public void setTotalPagarPopular(Double totalPagarPopular) {
        this.totalPagarPopular = totalPagarPopular;
    }

    @Override
    public Double calcularValorNeto() {
        if (this.getCantidadBoletas() > 1) {
            System.out.println("No se puede");
        }else {
            this.valorNetoPopular = this.valorBoletaPopular * this.getCantidadBoletas();
        }
        return valorNetoPopular;
    }

    @Override
    public Double calcularDescuentoTribuna() {
        this.valorDescuentoTribunaPopular = this.valorNetoPopular - (this.valorNetoPopular * this.descuentoPopular);
        return valorDescuentoTribunaPopular;
    }

    @Override
    public Double descuentoDia() {
        this.descuentoDia = this.valorNetoPopular - (this.valorNetoPopular * this.calcularDescuentoDia(1));
        return descuentoDia;
    }

    @Override
    public Double calcularIva() {
        this.valorIva = this.valorNetoPopular + (this.valorNetoPopular * this.getIva());
        return valorIva;
    }

    public Double calcularValorTotal (Double totalPagar){
        this.totalPagarPopular = this.valorNetoPopular - valorDescuentoTribunaPopular - descuentoDia + valorIva;
        return totalPagarPopular;
    }

}
