package com.example.recycler;

public class SmartphoneModel {

    private String marca;
    private String modelo;
    private String dimension;
    private String anio;

    public SmartphoneModel(String marca, String modelo, String dimension, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.dimension = dimension;
        this.anio = anio;
    }


    public SmartphoneModel(String marca, String modelo, String dimension) {
        this.marca = marca;
        this.modelo = modelo;
        this.dimension = dimension;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}
