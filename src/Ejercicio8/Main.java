package Ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accumulative = 0;
        String accumulativeString = "";

        System.out.println("Ingresa el numero final: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            accumulative = accumulative + i;
            accumulativeString = accumulativeString + "+" + i;
        }

        System.out.println("La suma es de: " + accumulativeString);
        System.out.println("Y el resultado es: " + accumulative);
    }
}
