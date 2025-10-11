package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hundredList= {
                "Ciento",
                "Doscientos",
                "Trescientos",
                "Cuatroscientos",
                "Quinientos",
                "Seiscientos",
                "Setescientos",
                "Ochocientos",
                "Nueveciento"
        };

        String[] tenList= {
                "Dieci",
                "Veinti",
                "Treinta",
                "Cuarenta",
                "Cincuenta",
                "Sesenta",
                "Setenta",
                "Ochenta",
                "Noventa"
        };

        String[] unitsList= {
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
        System.out.println(" =-= Ingrese 3 numeros (de 0 a 9) =-=");

        int[] numbers = getNumbers(sc);
        String resultText = getText(numbers,hundredList,tenList,unitsList);
        System.out.println(resultText);
        sc.close();
    }

    private static int[] getNumbers(Scanner sc){
        int[] numbers = new int[3];
        int num;
        for (int i = 0; i < 3; i++){
            System.out.println("Ingrese el numero " + (i+1));
            num = sc.nextInt();
            if (num < 0 || num > 9){
                num = 0;
            }
            numbers[i] = num;
        }
        return numbers;
    }

    private static String getText(int[] numbers,String[] hundredList, String[] tenList, String[] unitsList) {
        // maik, en la buena
        String firstText = "";
        String secondText = "";
        String thirdText = "";

        // aqui me toco verificar que los numeros sean mayor a 0
        if (numbers[0] > 0){
            firstText = hundredList[numbers[0]-1];
        }
        if (numbers[1] > 0){
            secondText = tenList[numbers[1]-1];
        }
        if (numbers[2] > 0){
            thirdText = unitsList[numbers[2]-1];
        }
        int tenResult = 0;
        String stringResult;

        // que lo que maik, pillelas, aqui cree un String para concatenar el Numero 2 y el 3 y luego lo convertimos a entero
        stringResult = String.valueOf(numbers[1]);
        stringResult = stringResult + (numbers[2]);
        tenResult = Integer.parseInt(stringResult);

        // esto lo hice por que del 10 al 15 se pronuncia diferente
        if (tenResult >= 10 && tenResult <= 15){
            switch (tenResult){
                case 10:
                    secondText = "Diez";
                    thirdText = "";
                    break;
                case 11:
                    secondText = "Once";
                    thirdText = "";
                    break;
                case 12:
                    secondText = "Doce";
                    thirdText = "";
                    break;
                case 13:
                    secondText = "Trece";
                    thirdText = "";
                    break;
                case 14:
                    secondText = "Catorce";
                    thirdText = "";
                    break;
                case 15:
                    secondText = "Quince";
                    thirdText = "";
                    break;
            }
        }

        return firstText + " " + secondText + " " + thirdText;
    }
}
