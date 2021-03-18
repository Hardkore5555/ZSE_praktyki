package PROjekt;

import java.util.Arrays;
import java.util.Random;

//Quiz?
public class Projekt {
    public static void main(String[] args) {
        System.out.println("Pytania: ");
        String pytania[] = {"Ile pies ma nog?","2","3","4","5"};
        Random rand = new Random();
        int losowe_pytanie = rand.nextInt(pytania.length);
        System.out.println("Wylosowane Pytanie: "+pytania[losowe_pytanie]);
        





    }
}
