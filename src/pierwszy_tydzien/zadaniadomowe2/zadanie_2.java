package pierwszy_tydzien.zadaniadomowe2;

import java.util.Scanner;

public class zadanie_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int raz = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int dwa = y.nextInt();
        Scanner z = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int trzy = z.nextInt();
        if (raz == dwa) {
            System.out.println("Pierwsza liczba jest równa drugiej.");
        }
        if (dwa == trzy) {
            System.out.println("Druga liczba jest równa trzeciej.");
        }
        if (raz == trzy) {
            System.out.println("Pierwsza liczba jest równa trzeciej.");
        }
        if (raz == dwa && dwa == trzy && raz == trzy){
        }
        else {
            if (raz > dwa) {
                if (raz > trzy)
                    System.out.println("Pierwsza liczba jest największa.");
            } else {
                if (dwa > trzy) {
                    System.out.println("Druga liczba jest największa.");
                } else {
                    System.out.println("Trzecia liczba jest największa.");
                }
            }
        }
    }
}