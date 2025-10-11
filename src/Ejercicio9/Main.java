package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberLimit = sc.nextInt();

        int accumulative = 0;
        String accumulativeString = "";

        for (int i = 1; i <= numberLimit; i++) {
            if (i % 2 == 0){
                accumulative += i;
                accumulativeString = accumulativeString + "+" + i;
            }
        }

        System.out.println("Los numeros pares son: " + accumulativeString);
        System.out.println("Los numeros pares son: " + accumulative);

    }
}
