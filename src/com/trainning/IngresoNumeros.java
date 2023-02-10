package com.trainning;

import java.util.Scanner;

public class IngresoNumeros {

    public static void ingreso () {
        System.out.println("Debe ingresar 10 numeros enteros");
        int[] numeros = new int[10];
        int[] par = new int[10];
        int[] impar = new int[10];
        int sumaImpar = 0;
        int cantidadImpar = 0;
        int promedioPar = 0;
        int cantidadPar = 0;
        int i = 0;
        do {
            System.out.println("Ingrese numero: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numeros[i] = scanner.nextInt();
                i++;
            } else
                System.out.println("El valor ingresado no es un numero");
        } while (i <= 9);

        System.out.println("Fin de ingreso");

        for (int a = 0; a <= 9; a++) {
            if (esPar(numeros[a])) {
                par[a] = numeros[a];
                cantidadPar++;
            } else {
                impar[a] = numeros[a];
                cantidadImpar++;
            }
        }

        for (int b = 0; b <= 9; b++) {
            sumaImpar += impar[b];
            promedioPar += par[b];
        }
        mostrarResultados(cantidadImpar,cantidadPar,sumaImpar,promedioPar);
    }
    public static void  mostrarResultados(int cantidadImpar, int cantidadPar, int sumaImpar, int promedioPar) {
        if (cantidadImpar > 0) {
            System.out.println("Se ingresaron " + cantidadImpar + " numeros impares");
            System.out.println("La suma de los numeros impares es: " + sumaImpar);
        } else
            System.out.println("No ingreso numero impares para realizar una suma");
        if (cantidadPar > 0) {
            System.out.println("Se ingresaron " + cantidadPar + " numeros pares");
            System.out.println("El promedio de los numeros pares es: " + promedioPar / cantidadPar);
        } else
            System.out.println("No ingreso numero pares para obtener su promedio");
    }


    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}