package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbersDate = getNumbersDate(sc);
        String birthDate = getBirthDate(numbersDate);
        System.out.println(birthDate);

    }

    private static int[] getNumbersDate(Scanner sc) {
        int[] numbers = new int[2];
        int num;
        String[] dateListText = {"dia", "mes"};
        for (int i = 0; i < 2; i++) {
            System.out.println("-=- Ingrese la fecha en este orden-=-");
            System.out.println("Ingrese el " + dateListText[i]);
            num = sc.nextInt();
            if (num <= 0 || num > 31) {
                num = 1;
            }
            numbers[i] = num;
        }
        return numbers;
    }

    private static String getBirthDate(int[] numbersDate) {
        String[] tenList = {
                "Dieci",
                "Veinti",
                "Treintai"
        };

        String[] unitsList = {
                "Uno",
                "Dos",
                "Tres",
                "Cuatro",
                "Cinco",
                "Seis",
                "Siete",
                "Ocho",
                "Nueve"
        };

        String[] monthsList = {
                "Vacio",
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

        String[] specialList= {
                "Diez",
                "0nce",
                "Doce",
                "Trece",
                "Catorce",
                "Quince"
        };

        String dayDate = "Uno";
        String monthDate = "Enero";


        if (numbersDate[0] >= 1 && numbersDate[0] <= 9) {
            dayDate = unitsList[numbersDate[0]];
        } else if (numbersDate[0] >= 10 && numbersDate[0] <= 15) {
            dayDate = specialList[numbersDate[0]-10];
        } else {
            dayDate = tenList[(numbersDate[0] / 10) -1];
            dayDate = dayDate + unitsList[(numbersDate[0] % 10) -1];
        }

        // si arriba son numeros de dias, aqui que es? muy bieeeen los mesesss
        if (numbersDate[1] >= 1 && numbersDate[1] <= 12) {
            monthDate = monthsList[numbersDate[1]];
        }

        return dayDate + " de " + monthDate;
    }
}
