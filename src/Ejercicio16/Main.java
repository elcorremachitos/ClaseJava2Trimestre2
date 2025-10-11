package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NO ESTA HECHO EL EJERCICIO, AUN NO ENTIENDO COMO HACERLO AHHHHH
        System.out.println("Ingresa el numero limite: ");
        int numberLimit = sc.nextInt();

        int accumulative = 0;
        int counter = 1;
        String accumulativeString = "";

        accumulative = accumulative + 1;
        accumulativeString =  accumulativeString + "+" + 1;

        for (int i = 2; i <= numberLimit; i++) {
            counter = counter + 1;
            accumulative = accumulative - i;
            accumulativeString =  accumulativeString + "-" + i;
            for (int j = 0; j < counter; j++) {
                accumulative = accumulative + i;
                accumulativeString =  accumulativeString + "+" + i;
                i = i + i;
            }
        }

        System.out.println("La secuencia de numeros es: " + accumulativeString);
        System.out.println("Y el resultado es: " + accumulative);

    }
}
