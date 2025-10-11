package Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();

        float accumulative = 0;
        String accumulativeString = "";

        for (int i = 1; i <= numberLimit; i++) {
            if (i % 2 != 0) {
                accumulative = accumulative + ((float) 1 / (i*i));
                accumulativeString = accumulativeString + " + " + "1/(" + i + "*" + i + ")";
            }
        }

        System.out.println("La secuencia de numeros es: " + accumulativeString);
        System.out.println("Y el resultado es: " + accumulative);

    }
}
