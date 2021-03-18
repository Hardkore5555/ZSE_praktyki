package PROjekt;

import java.util.Scanner;

public class Projekt {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Pytanie: Ile pies ma nog?" +
                           "   a)1 | b)2 | c)3 | d)4                    ");

        char odpowiedzi = skaner.next().charAt(0);
switch (odpowiedzi) {
    case 'a':
        System.out.println("zła odpowiedź");
        break;
    case 'b':
        System.out.println("zła odpowiedź");
        break;
    case 'c':
        System.out.println("zła odpowiedź");
        break;
    case 'd':
        System.out.println("dobra odpowiedź");
        break;
    default:
}






    }

}
