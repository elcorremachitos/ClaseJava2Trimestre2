package Ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countryId = getCountryId(sc);
        String countryCivilitanName = getCountryCivilitian(sc, countryId);
        System.out.println("El sujeto es " + countryCivilitanName);

    }

    private static int getCountryId(Scanner sc){
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

        boolean flag = false;
        int idCountry = 0;

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

        return idCountry;
    }

    private static String getCountryCivilitian(Scanner sc, int idCountry) {

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

        String nationality;


        nationality = countryListUser[idCountry];
        return nationality;
    }
}
