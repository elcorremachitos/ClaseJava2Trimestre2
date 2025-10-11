package Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();

        System.out.println("Ingresa el multiplo: ");
        int numberMultiply = sc.nextInt();

        int accumulative = 0;
        String accumulativeString = "";

        for (int i = 1; i <= numberLimit; i++) {
            if (i % numberMultiply == 0) {
                accumulative = accumulative + i;
                accumulativeString =  accumulativeString + "+" + i;
            }
        }

        System.out.println("La secuencia de numeros es: " + accumulativeString);
        System.out.println("Y el factorial es: " + accumulative);

    }
}
