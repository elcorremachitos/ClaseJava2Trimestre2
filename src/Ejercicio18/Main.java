package Ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();

        System.out.println("Tabla del " + numberLimit);
        for (int i = 1; i <= numberLimit; i++) {
            System.out.println(numberLimit + "x" + i + " = " + i*numberLimit);
        }
    }
}
