package com.trainning;

import java.util.ArrayList;

public class Phone extends Mobile {

    Phone(String brand, String model, String color) {
        super(brand, model, color);

    }

    public Phone() {
        super();
    }


    @Override
    public String toString(){
        return super.toString() + "\n";
    }

}
