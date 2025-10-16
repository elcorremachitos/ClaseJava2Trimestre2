package Ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de ciclos: ");
        int numberLimit = sc.nextInt();

        String accumulativeString = "";
        int firstDigit = 0;
        int secondDigit = 1;
        int accumulative = 0;


        for (int i = 0; i <= numberLimit; i++) {
            accumulativeString = accumulativeString + "+" +firstDigit ;

            accumulative = firstDigit+secondDigit;
            firstDigit = secondDigit;
            secondDigit = accumulative;


        }

        System.out.println("La serie es: " + accumulativeString);
        System.out.println("El resultado es: " + accumulative);
    }
}
