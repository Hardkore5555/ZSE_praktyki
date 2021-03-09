package trzeci_tydzien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Wyjątki {
    public static void isNotNegative(int a, int b) throws Exception{

        if (b<0){
            throw new Exception();
        }
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj liczbe A: ");
            int A = scanner.nextInt();

            System.out.println("Podaj liczbe B: ");
            int B = scanner.nextInt();

            System.out.println("liczba A: " + A + " Liczba B: " + B);
            
            isNotNegative(A,B);
            System.out.println(A/B);
        } catch (Exception exception) {
            System.out.println("Wyskoczył Błąd, Spróbuj ponownie");
        }
        System.out.println("Koniec");
    }
}
