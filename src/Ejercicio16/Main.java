package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();

        int accumulative = 0;
        int positiveTotal = 1;
        int total = 0;
        String accumulativeString = "";

        for (int i = 1; i <= numberLimit; i++) {
            accumulative = accumulative + 1;
            positiveTotal = positiveTotal + 1;
            total = total - accumulative;
            accumulativeString = accumulativeString + "-" + accumulative;
            for (int j = 0; j < positiveTotal; j++){
                accumulative = accumulative + 1;
                accumulativeString = accumulativeString + "+" + accumulative;
                total = total + accumulative;
            }
        }

        System.out.println("La secuencia de numeros es: " + accumulativeString);
        System.out.println("Y el resultado es: " + total);

    }
}
