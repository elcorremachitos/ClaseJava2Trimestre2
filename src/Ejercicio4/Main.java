package Ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String countryName = getCountryCivilitian(sc);
        System.out.println("El sujeto es " + countryName);

    }

    private static String getCountryCivilitian(Scanner sc) {
        String[] countryListName = {
                "Vacio",
                "Colombia",
                "Venezuela",
                "Brasil",
                "Ecuador",
                "Peru",
                "Bolivia",
                "Chile",
                "Argentina",
                "Uruguay",
                "Paraguay"
        };

        String[] countryListUser = {
                "Vacio",
                "Colombiano",
                "Venezolano",
                "Brasileño",
                "Ecuatoriano",
                "Peruano",
                "Boliviano",
                "Chileno",
                "Argentino",
                "Uruguayo",
                "Paraguao"
        };

        int idCountry = 0;
        String nationality;
        boolean flag = false;

        System.out.println("Lista de paises: ");
        for (int i = 0; i < countryListName.length; i++) {
            System.out.println(i + ". " + countryListName[i]);
        }
        System.out.println("\nIngrese el numero del pais: ");

        while (!flag) {
            idCountry = sc.nextInt();
            if (idCountry > 0 && idCountry <= 10) {
                flag = true;
            }
        }

        nationality = countryListUser[idCountry];
        return nationality;
    }
}
