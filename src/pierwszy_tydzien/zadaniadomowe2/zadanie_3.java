package pierwszy_tydzien.zadaniadomowe2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadanie_3 {
    public static void main(String[] args) {
        // poprawny login: admin
        // poprawne hasło: haslo
        Scanner login = new Scanner(System.in);
        System.out.println("Podaj swój login: ");
        String log = login.toString();
        Scanner haslo = new Scanner(System.in);
        System.out.println("Podaj swoje haslo: ");
        String has = haslo.toString();
        if (log == "admin") {

        }
        else{
            System.out.println("Niepoprawny login.");
        }
        if (has == "haslo") {

        }
        else{
            System.out.println("Niepoprawne hasło.");
        }
    }
}