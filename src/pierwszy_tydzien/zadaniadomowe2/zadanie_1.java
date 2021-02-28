package pierwszy_tydzien.zadaniadomowe2;

import java.util.Scanner;

public class zadanie_1 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = podaj.nextInt();
        if (liczba == 0) {
            System.out.println("Podana liczba jest równa 0.");
        } else {
            if (liczba > 0) {
                System.out.println("Podana liczba jest większa od 0.");
            } else {
                if (liczba < 0) {
                    System.out.println("Podana liczba jest mniejsza od 0.");
                }
                
            }
        }
    }
}
