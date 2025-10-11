package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero para hallar el factorial: ");
        int numberLimit = sc.nextInt();

        int accumulative = 1;
        String accumulativeString = "";

        for (int i = 1; i <= numberLimit; i++) {
                accumulative = accumulative * i;
                accumulativeString =  accumulativeString + "*" + i;
        }

        System.out.println("La secuencia de numeros es: " + accumulativeString);
        System.out.println("Y el factorial es: " + accumulative);

    }
}
