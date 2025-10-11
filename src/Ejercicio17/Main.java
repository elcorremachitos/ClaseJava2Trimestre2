package Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // No se como hacerlo, esperare a las clases
        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();

        int accumulative = 0;
        int counter = 1;
        String accumulativeString = "";

        for (int i = 1; i <= numberLimit; i++) {
            counter = counter + 1;
            for (int j = 0; j <= counter; j++) {
                if(j % 2 != 0) {
                    accumulative = accumulative + j;
                    accumulativeString =  accumulativeString + "+" + j;
                }
            }
        }

        System.out.println("La secuencia de numeros es: " + accumulativeString);
        System.out.println("Y el resultado es: " + accumulative);

    }
}
