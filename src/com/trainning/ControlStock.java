package com.trainning;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlStock {

    public static void stock () {
        int exit = 0;
        Scanner screen = new Scanner(System.in);
        String value = null;
        ArrayList<Mobile> mobileList = new ArrayList<Mobile>();
        SmartPhone smart = new SmartPhone();
        do{
            System.out.println("Ingrese que accion desea realizar:");
            System.out.println("T - Listar todos los dispositivos");
            System.out.println("L - Listar unicamente los smartphones");
            System.out.println("C - Agregar un celular");
            System.out.println("S - Agregar un smatphone");
            System.out.println("X - Para Salir");
            System.out.println(" ");
            value = screen.nextLine();

            if (value.toLowerCase().equals("t")) {
                toList(mobileList,value);
            } else if (value.toLowerCase().equals("c") || value.toLowerCase().equals("s")) {
                mobileList.add(addMobile(value));
            } else if (value.toLowerCase().equals("x")) {
                exit = 1;
            } else if (value.toLowerCase().equals("l")){
                listSmart(mobileList, smart);
            }
            else {
                System.out.println("No ingreso la opción correcta");
            }
        }while(exit == 0);
    }

    public static void toList(ArrayList<Mobile> mobileList, String value){
        if(mobileList.size()>0){
            System.out.println(mobileList);
        }else{
            System.out.println("No ingreso ningun dispositivo, debe agregar uno para listar");
        }
    }
    public static void listSmart(ArrayList<Mobile> mobileList, SmartPhone smart){
        if(mobileList.size()>0){
            System.out.println("Se intenta mostrar solo los smartphones");
        }else{
            System.out.println("No ingreso ningun smartphone, debe agregar uno");
        }
    }

    public static Mobile addMobile( String value){
		String brand = null;
        String model = null;
        String color = null;
        String so = null;
        int battery = 0;
        Scanner caracteristicas = new Scanner(System.in);
        System.out.println("Ingrese marca");
        brand = caracteristicas.nextLine();
        while (brand == null || brand.equals("")){
            System.out.println("Debe ingrese marca");
			brand = caracteristicas.nextLine();
        }
        System.out.println("Ingresar modelo");
        model = caracteristicas.nextLine();
		while (model == null || model.equals("")){
            System.out.println("Debe ingrese marca");
			model = caracteristicas.nextLine();
        }
        System.out.println("Ingresar color");
        color = caracteristicas.nextLine();
		while (color == null || color.equals("")){
            System.out.println("Debe ingrese marca");
			color = caracteristicas.nextLine();
        }
        if (value.equals("c"))
            return new Phone(brand,model,color);
        else {
            System.out.println("Ingrese sistema operativo del dispositivo: ");
            so = ", " + caracteristicas.nextLine();
            while (so == null || so.equals("")){
                System.out.println("Debe ingresar sistema operativo");
                so=caracteristicas.nextLine();
            }
            System.out.println("Ingrese tamaño de bateria");
            battery = caracteristicas.nextInt();
            while (battery==0){
                System.out.println("Debe ingresar un valor numerico de bateria");
                battery=caracteristicas.nextInt();
            }
            return new SmartPhone(brand,model,color,so,battery);
        }
    }
}
