package Ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();

        int accumulative = 0;
        String accumulativeString = "";

        accumulative = accumulative + 1;
        accumulativeString =  accumulativeString + "+" + 1;

        for (int i = 2; i <= numberLimit; i++) {
            if (i % 2 == 0) {
                accumulative = accumulative + i;
                accumulativeString =  accumulativeString + "+" + i;
            } else {
                accumulative = accumulative - i;
                accumulativeString =  accumulativeString + "-" + i;
            }
        }

        System.out.println("La secuencia de numeros es: " + accumulativeString);
        System.out.println("Y el resultado es: " + accumulative);

    }
}
