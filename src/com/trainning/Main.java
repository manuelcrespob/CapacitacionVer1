package com.trainning;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner datoM = new Scanner(System.in);
            String valorM = null;
            int salirM=0;
            do{
                System.out.println("Que programa desea utilizar?");
                System.out.println("I - Ingresar numeros");
                System.out.println("C - Agregar y controlar stock de dispositivos");
                System.out.println("S - Para Salir");
                System.out.println(" ");
                valorM = datoM.nextLine();

                if (valorM.toLowerCase().equals("i")) {
                    IngresoNumeros.ingreso();
                    System.out.println("");
                } else if (valorM.toLowerCase().equals("c")) {
                    ControlStock.stock();
                    System.out.println("");
                } else if (valorM.toLowerCase().equals("s")) {
                    salirM = 1;
                }
                else {
                    System.out.println("No ingreso la opción correcta");
                }
            }while(salirM == 0);
        }
}
