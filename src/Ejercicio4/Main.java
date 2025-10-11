package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] countryList = {
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

        String countryName = getCountryCivilitian(countryList, sc);
        System.out.println("El sujeto es " + countryName);

    }

    private static String getCountryCivilitian(String[] countryList, Scanner sc) {
        System.out.println("Ingrese el numero del country");
        int idCountry = 0;
        String nationality = "Ninguna";
        boolean flag = false;
        while (!flag) {
            idCountry = sc.nextInt();
            if (idCountry > 0 && idCountry <= 10) {
                flag = true;
            }
        }

        switch (idCountry) {
            case 1:
                nationality = "Colombiano";
                break;
            case 2:
                nationality = "Colombiano";
                break;
            case 3:
                nationality = "Brasileño";
                break;
            case 4:
                nationality = "Ecuatoriano";
                break;
            case 5:
                nationality = "Peruano";
                break;
            case 6:
                nationality = "Boliviano";
                break;
            case 7:
                nationality = "Chileno";
                break;
            case 8:
                nationality = "Argentino";
                break;
            case 9:
                nationality = "Uruguay";
                break;
            case 10:
                nationality = "Paraguayo";
                break;
        }
        return nationality;
    }
}
