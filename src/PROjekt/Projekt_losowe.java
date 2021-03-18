package PROjekt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Quiz?
public class Projekt_losowe {
    public static void main(String[] args) {
        System.out.println("Pytania: ");
        String pytania[] = {"Ile pies ma nog?", "2", "3", "4", "5"};
        Random rand = new Random();
        int losowe_pytanie = rand.nextInt(pytania.length);
        System.out.println("Wylosowane Pytanie: " + pytania[losowe_pytanie]);

        Scanner odpowiedź = new Scanner(System.in);
        System.out.println("Podaj Odpowiedź: ");
        String odp = odpowiedź.next();
        if (odp.equals("d")) {
            System.out.println("Poprawna odpowiedź");
        } else {
            System.out.println("Zła odpowiedź");
        }


    }
}
