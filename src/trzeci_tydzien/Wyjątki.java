package trzeci_tydzien;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
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

            isNotNegative(B);
            System.out.println(A/B);
        } catch (ArithmeticException przez0sieniedzieli) {
            System.out.println("Nie dzielimy przez 0");
        } catch (InputMismatchException zlyTypDanychWyjatek){
            System.out.println("Podano zły typ danych :(");
        }catch (Exception exception){
            System.out.println("To nie była liczba dodatnia");
        }
        System.out.println("Koniec");
    }

    private static void isNotNegative(int b) {
    }
}
