package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Ingresa el numero final: ");

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
