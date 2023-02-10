package com.trainning;

import java.util.ArrayList;

public class SmartPhone extends Mobile {
    String so = null;
    int battery =0;

    public String getSo(){
        return so;
    }
    public int getBattery(){
        return battery;
    }

    SmartPhone(String brand, String model, String color, String so, int battery) {
        super(brand, model, color);
        this.battery = battery;
        this.so = so;
    }
    public SmartPhone(){
        super();
    }

    @Override
    public String toString(){
        return super.toString() +", Sistema operativo: " + so + ", Tamaño bateria: "+ battery;
    }

}
