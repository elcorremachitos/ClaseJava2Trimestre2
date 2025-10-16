package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list_Prices = {
                1250, // Flor 1
                1100, // Flor 2
                1205, // Flor 3
                1050, // Flor 4
                1000, // Flor 5
                1200 // Flor 6
        };

        // saludos pa maik
        int typeFlower = getFlowerOption(sc);
        int colorFlower = getFlowerColor(sc);
        int quantityFlower = getFlowerQuantity(sc);
        int totalPrice = getFlowerTotalPrice(typeFlower,colorFlower,quantityFlower,list_Prices);
        System.out.println("El producto es: " + totalPrice);
        sc.close();
    }

    private static int getFlowerOption(Scanner sc) {
        System.out.println("Seleccione el tipo de flor que requiera: ");
        System.out.println("1. Rosas");
        System.out.println("2. Claveles");
        return sc.nextInt();
    }

    private static int getFlowerColor(Scanner sc) {
        System.out.println("Seleccione el color de flor que requiera: ");
        System.out.println("1. Roja");
        System.out.println("2. Blanca");
        return sc.nextInt();
    }

    private static int getFlowerQuantity(Scanner sc) {
        System.out.println("¿Cuantas flores quieres comprar?");
        return sc.nextInt();
    }

    private static int getFlowerTotalPrice(int typeFlower, int colorFlower, int quantityFlower, int[] listPrices) {
        // Rosas
        int pricePerFlower = 0;
        if (typeFlower == 1){
            if (colorFlower == 1){
                if (quantityFlower <= 12){
                    pricePerFlower = listPrices[0];
                } else  {
                    pricePerFlower = listPrices[1];
                }
            } else{
                pricePerFlower = listPrices[2];
            }
        }
        // Claveles
        else if (typeFlower == 2){
            if (colorFlower == 2){
                if (quantityFlower <= 12){
                    pricePerFlower = listPrices[3];
                } else  {
                    pricePerFlower = listPrices[4];
                }
            } else{
                pricePerFlower = listPrices[5];
            }
        }
        return pricePerFlower * quantityFlower;
    }

}