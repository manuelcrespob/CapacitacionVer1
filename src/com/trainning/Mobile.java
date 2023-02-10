package com.trainning;

public class Mobile {
    String brand = null;
    String model = null;
    String color = null;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String toString(){
        return "Celular: "+this.getClass().getSimpleName()+" Marca: "+brand+", Modelo: "+model+", Color: "+color +"\n";
    }
    public Mobile(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public Mobile (){

    }

}

