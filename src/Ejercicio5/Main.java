package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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


        int[] numbersDate = getNumbersDate(sc);
        String birthDate = getBirthDate(numbersDate,tenList,unitsList,monthsList);
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

    private static String getBirthDate(int[] numbersDate, String[] tenList, String[] unitsList, String[] monthsList) {
        String dayDate = "";
        String monthDate = "";

        // maik, esta es la logica pa ya tu sabe, los numeros
        if (numbersDate[0] >= 1 && numbersDate[0] <= 9) {
            dayDate = unitsList[numbersDate[0]];
        } else if (numbersDate[0] >= 10 && numbersDate[1] <= 15) {
            switch (numbersDate[0]) {
                case 10:
                    dayDate = "Diez";
                    break;
                case 11:
                    dayDate = "Once";
                    break;
                case 12:
                    dayDate = "Doce";
                    break;
                case 13:
                    dayDate = "Trece";
                    break;
                case 14:
                    dayDate = "Catorce";
                    break;
                case 15:
                    dayDate = "Quince";
                    break;
            }
        } else {
            dayDate = tenList[numbersDate[0] - 1];
        }

        // si arriba son numeros de dias, aqui que es? muy bieeeen los mesesss
        if (numbersDate[1] >= 1 && numbersDate[1] <= 12) {
            monthDate = monthsList[numbersDate[1]];
        }


        return dayDate + " de " + monthDate;
    }
}
