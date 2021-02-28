package pierwszy_tydzien.zadaniadomowe2;


import java.util.Scanner;

public class zadanie_5 {
    public static void main(String[] args) {
        Scanner l1 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double x = l1.nextInt();
        Scanner l2 = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę: ");
        double y = l2.nextInt();
        Scanner działanie = new Scanner(System.in);
        System.out.println("Wybierz działanie (+,-,*,/): ");
        char wybór = działanie.next().charAt(0);
        switch (wybór) {
            case '+':
                double wynikdodawania = x + y;
                System.out.println("Wynik dodawania: "+ wynikdodawania);
                break;
            case '-':
                double wynikodejmowania = x - y;
                System.out.println("Wynik odejmowania: "+ wynikodejmowania);
                break;
            case '*':
                double wynikmnożenia = x * y;
                System.out.println("Wynik mnożenia: "+ wynikmnożenia);
                break;
            case '/':
                double wynikdzielenia = x / y;
                System.out.println("Wynik dzielenia: "+ wynikdzielenia);
                break;
            default:
                System.out.println("Nie wybrano żadnego działania.");
                break;

        }
    }
}

