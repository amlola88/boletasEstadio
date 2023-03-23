package org.example;

import java.util.Scanner;

public class Popular extends Cliente {
    private Double valorBoletaPopular = 40.000;
    private Double descuentoPopular = 0.35;
    private Double valorNeto;
    private Double valorDescuentoTribuna;
    private Double descuentoDia;
    private Double valorIva;
    private Double totalPagar;

    public Popular() {
    }

    public Popular(String nombre,
                   String cedula,
                   String celular,
                   String correo,
                   String direccion,
                   Integer diaCompra,
                   Double valorBoleta,
                   Double valorCompra,
                   Integer tipoTribuna,
                   Integer cantidadBoletas,
                   Double iva,
                   Double valorBoletaPopular,
                   Double descuentoPopular,
                   Double valorNeto,
                   Double valorDescuentoTribuna,
                   Double descuentoDia,
                   Double valorIva,
                   Double totalPagar) {
        super(nombre, cedula, celular, correo, direccion, diaCompra, valorBoleta, valorCompra, tipoTribuna, cantidadBoletas, iva);
        this.valorBoletaPopular = valorBoletaPopular;
        this.descuentoPopular = descuentoPopular;
        this.valorNeto = valorNeto;
        this.valorDescuentoTribuna = valorDescuentoTribuna;
        this.descuentoDia = descuentoDia;
        this.valorIva = valorIva;
        this.totalPagar = totalPagar;
    }

    @Override
    public Double calcularValorNeto() {
        if (this.getCantidadBoletas() > 1) {
            System.out.println("No se puede");
        }else {
            this.valorNeto = this.valorBoletaPopular * this.getCantidadBoletas();
        }
        return valorNeto;
    }

    @Override
    public Double calcularDescuentoTribuna() {
        this.valorDescuentoTribuna = this.valorNeto - (this.valorNeto * this.descuentoPopular);
        return valorDescuentoTribuna;
    }

    @Override
    public Double descuentoDia() {
        this.descuentoDia = this.valorNeto - (this.valorNeto * this.calcularDescuentoDia(1));
        return descuentoDia;
    }

    @Override
    public Double calcularIva() {
        this.valorIva = this.valorNeto + (this.valorNeto * this.getIva());
        return valorIva;
    }

    public Double calcularValorTotal (Double totalPagar){
        this.totalPagar = this.valorNeto - valorDescuentoTribuna - descuentoDia + valorIva;
        return totalPagar;
    }

}
