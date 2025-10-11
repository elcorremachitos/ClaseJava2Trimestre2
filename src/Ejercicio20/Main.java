package Ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de ciclos: ");
        int numberLimit = sc.nextInt();

        // ejercicio tan maluco, casi que no lo hago
        String accumulativeString = "";
        int firstDigit = 0;
        // aqui lo coloque en 1 para poder inicializar la serie, porque sino siempre daria 0 + 0
        int secondDigit = 1;
        int sum = 0;


        for (int i = 0; i <= numberLimit; i++) {
            accumulativeString = accumulativeString + "+" +firstDigit ;

            // voy a colocar un ejemplo porque despues se me olvida como se hace esta vaina:
            // Primer ciclo: sum = 0 + 1 | firstDigit = 1 | secondDigit = 1
            // Segundo ciclo: sum = 1 + 1 | firstDigit = 1 | secondDigit = 2
            // Tercer ciclo: sum = 1 + 2 | firstDigit = 2 | secondDigit = 3
            // Cuarto ciclo: sum = 2 + 3 | firstDigit = 3 | secondDigit = 5
            sum = firstDigit+secondDigit;
            firstDigit = secondDigit;
            secondDigit = sum;


        }

        System.out.println("La serie es: " + accumulativeString);
        System.out.println("El resultado es: " + sum);
    }
}
