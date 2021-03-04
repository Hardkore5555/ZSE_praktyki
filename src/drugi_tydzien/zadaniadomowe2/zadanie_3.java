package drugi_tydzien.zadaniadomowe2;

import java.util.Random;

public class zadanie_3 {
    public static void main(String[] args) {

        Random random = new Random();


        String[] ImionaPsa = {"Hektor", "Aleks", "Maki"};
        System.out.println("");
        int LosoweImiePsa = random.nextInt(3) + 1;
        if (LosoweImiePsa == 1) {
            System.out.println("Wylosowane imię dla psa: " + ImionaPsa[0]);
        }
        if (LosoweImiePsa == 2) {
            System.out.println("Wylosowane imię dla psa: " + ImionaPsa[1]);
        }
        if (LosoweImiePsa == 3) {
            System.out.println("Wylosowane imię dla psa: " + ImionaPsa[2]);
        }

    }
}

