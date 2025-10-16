package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" =-= Ingrese 3 numeros (de 0 a 9) =-=");

        int[] numbers = getNumbers(sc);
        String resultText = getText(numbers);
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

    private static String getText(int[] numbers){
        // maik, en la buena
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
                "Treintai",
                "Cuarentai",
                "Cincuentai",
                "Sesentai",
                "Setentai",
                "Ochentai",
                "Noventai"
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

        String[] specialList= {
                "Diez",
                "0nce",
                "Doce",
                "Trece",
                "Catorce",
                "Quince"
        };

        String firstText = "";
        String secondText = "";
        String thirdText = "";
        int tenResult;
        String stringTenResult;

        // que lo que maik, pillelas, aqui cree un String para concatenar el Numero 2 y el 3 y luego lo convertimos a entero y poder compararlo
        stringTenResult = String.valueOf(numbers[1]);
        stringTenResult = stringTenResult + numbers[2];
        tenResult = Integer.parseInt(stringTenResult);

        // aqui me toco verificar que los numeros sean mayor a 0, para que de esta manera no me de error de indice negativo
        if (numbers[0] > 0){
            firstText = hundredList[numbers[0]-1];
        }
        if (numbers[1] > 0){
            secondText = tenList[numbers[1]-1];
        }
        if (numbers[2] > 0){
            thirdText = unitsList[numbers[2]-1];
        }

        // esto lo hice por que del 10 al 15 se pronuncia diferente
        if (tenResult >= 10 && tenResult <= 15){
            secondText = specialList[tenResult - 10];
            thirdText = "";
        }

        return firstText + " " + secondText + " " + thirdText;
    }
}
