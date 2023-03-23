package org.example;

public abstract class Cliente {
    private String nombre = "LuisaDianaAngela";
    private String cedula = "123456";
    private String celular ="254321";
    private String correo = "ludian@gmail.com";
    private String direccion = "calle la geta";

    private Integer diaCompra;

    private Double valorBoleta;

    private Double valorCompra;

    private Integer tipoTribuna;

    private Integer cantidadBoletas;

    private Double iva = 0.19;

    public Cliente() {
    }

    public Cliente(String nombre,
                   String cedula,
                   String celular,
                   String correo,
                   String direccion,
                   Integer diaCompra,
                   Double valorBoleta,
                   Double valorCompra,
                   Integer tipoTribuna,
                   Integer cantidadBoletas,
                   Double iva) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.diaCompra = diaCompra;
        this.valorBoleta = valorBoleta;
        this.valorCompra = valorCompra;
        this.tipoTribuna = tipoTribuna;
        this.cantidadBoletas = cantidadBoletas;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(Integer diaCompra) {
        this.diaCompra = diaCompra;
    }

    public Double getValorBoleta() {
        return valorBoleta;
    }

    public void setValorBoleta(Double valorBoleta) {
        this.valorBoleta = valorBoleta;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Integer getTipoTribuna() {
        return tipoTribuna;
    }

    public void setTipoTribuna(Integer tipoTribuna) {
        this.tipoTribuna = tipoTribuna;
    }

    public Integer getCantidadBoletas() {
        return cantidadBoletas;
    }

    public void setCantidadBoletas(Integer cantidadBoletas) {
        this.cantidadBoletas = cantidadBoletas;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double calcularDescuentoDia (Integer diaCompra) {

        if (diaCompra == 1) {
            return 0.05;
        } else if (diaCompra == 2) {
            return 0.02;
        } else if (diaCompra == 3) {
            return 0.015;
        } else{
            return 0.01;
        }
    }

    public abstract Double calcularValorNeto();

    public abstract Double calcularDescuentoTribuna();

    public abstract Double descuentoDia();

    public abstract Double calcularIva();

}
