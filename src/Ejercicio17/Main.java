package Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();
        System.out.println(numberLimit);

        String accumulativeString;

        for (int i = 1; i <= numberLimit; i++){
            accumulativeString = "";
            for (int j = 0; j <= i*2; j++) {
                if (j % 2 != 0){
                    accumulativeString = accumulativeString + "+" + j;
                }
            }
            System.out.println(accumulativeString + " = " + i + " al cuadrado (" + i*i + ")");
        }

    }
}
