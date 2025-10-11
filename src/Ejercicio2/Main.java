package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] months = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Agosto",
                "Septiembre",
                "Octubre",
                "Noviembre",
                "Diciembre"
        };

        String month = getMonth(sc,months);
        System.out.println("El mes seleccionado fue: " + month);

        sc.close();
    }

    private static String getMonth(Scanner sc, String[] month) {
        System.out.println("Ingrese el numero del mes");
        while (true) {
            int num = sc.nextInt();
            if (num >= 1 && num <= 12){
                return month[num-1];
            }
        }
    }
}
