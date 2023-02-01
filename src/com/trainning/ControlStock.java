package com.trainning;

import java.util.Scanner;

public class ControlStock {

    public static void stock () {
        char[] accion = {'t', 'c', 's', 'x','l'};
        String[] celular = new String[100];
        String[] smatphone = new String[100];
        int celularesAgregados = 0;
        int smartphonesAgregados = 0;
        int salir = 0;
        Scanner dato = new Scanner(System.in);
        String valor = null;

        do{
            System.out.println("Ingrese que accion desea realizar:");
            System.out.println("T - Listar todos los dispositivos");
            System.out.println("L - Listar unicamente los smartphones");
            System.out.println("C - Agregar un celular");
            System.out.println("S - Agregar un smatphone");
            System.out.println("X - Para Salir");
            System.out.println(" ");
            valor = dato.nextLine();

            if (valor.toLowerCase().equals("t")) {
                ListarTodo(celular, smatphone, celularesAgregados, smartphonesAgregados);

            } else if (valor.toLowerCase().equals("c")) {
                celular[celularesAgregados] = AgregarCelular();
                celularesAgregados++;

            } else if (valor.toLowerCase().equals("s")) {
                smatphone[smartphonesAgregados] = AgregarSmartphone();
                smartphonesAgregados++;

            } else if (valor.toLowerCase().equals("x")) {
                salir = 1;
            } else if (valor.toLowerCase().equals("l")){
                for(int i=0; i<=smartphonesAgregados; i++)
                    ListarSmart(smatphone, i);
            }
            else {
                System.out.println("No ingreso la opción correcta");
            }
        }while(salir == 0);
    }

    public static void ListarTodo(String celu[], String smart[], int cantidadCelular, int cantidadSmart){
        for (int i=0; i<cantidadCelular;i++) {
            System.out.println("Caracteristicas del celular #: " + i);
            System.out.println(celu[i]);
        }
        for (int y=0; y<cantidadSmart;y++){
            System.out.println("caracteristivas del smartphone #: " + y);
            System.out.println(smart[y]);
        }
    }

    public static void ListarSmart(String smart[], int cantidad){
        for (int i=0; i<cantidad;i++){
            System.out.println("SmartPhone #: " + i);
            System.out.println(smart[i]);
        }

    }

    public static String  AgregarCelular(){
        String celular = null;
        Scanner caracteristicas = new Scanner(System.in);
        System.out.println("Ingrese marca");
        celular= caracteristicas.nextLine() + ", ";
        System.out.println("Ingresar modelo");
        celular+= caracteristicas.nextLine() + ", ";
        System.out.println("Ingresar color");
        celular+= caracteristicas.nextLine();
        return celular;
    }
    public static String AgregarSmartphone(){
        String smartphone = null;
        Scanner caracteristicas = new Scanner(System.in);
        System.out.println("Ingrese marca");
        smartphone= caracteristicas.nextLine() + ", ";
        System.out.println("Ingrese modelo");
        smartphone+= caracteristicas.nextLine() + ", ";
        System.out.println("Ingreser color");
        smartphone+= caracteristicas.nextLine() + ", ";
        System.out.println("Ingrese el sistema operativo");
        smartphone+= caracteristicas.nextLine() + ", ";
        System.out.println("Ingrese el tamaño de la bateria");
        smartphone+= caracteristicas.nextLine();
        return smartphone;
    }
}
