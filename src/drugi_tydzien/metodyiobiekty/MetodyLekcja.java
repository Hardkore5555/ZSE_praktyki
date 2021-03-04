package drugi_tydzien.metodyiobiekty;

import java.util.Scanner;

public class MetodyLekcja {
    static int dodawanieLiczb(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    static void printSomething() {
        System.out.println("\nSomething");
    }

    static void printSomethingIfNumberIsBig(int number) {
        if (number < 10) {
            return;
        }
        System.out.println("Something bo liczba była większa od 10");
    }
static boolean isLegal(int someAge){
        return someAge >=16;
}

    public static void main(String[] args) {
        System.out.println("Wywołanie metody Dodawania");

        int suma = dodawanieLiczb(5, 6, 2);
        System.out.println("Wynik to: " + suma);
        printSomething();
        System.out.println("podaj liczbe: ");
        Scanner liczba = new Scanner(System.in);
        int number = liczba.nextInt();
        printSomethingIfNumberIsBig(number);
        int someAge = 14;
        boolean result = isLegal(someAge);
        System.out.println("Age "+someAge+" is Legal \n That statement is: "+result);
    }
}




