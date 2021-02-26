package pierwszy_tydzien.basics;

import java.util.Scanner;

public class if_else_scanner_switch {
    public static void main(String[] args) {
boolean stan = true;
if (stan){
    System.out.println("Wykonała się instrukacja IF");
}
else{
    System.out.println("Wykonała się instrukcja else");
}

        Scanner skaner = new Scanner(System.in);
System.out.println("Podaj swój wiek: ");
int wiek = skaner.nextInt();
if (wiek >= 18) {
    System.out.println("Jestes pełnoletni");
}
else{
    System.out.println("Jestes niepełnoletni");
    }

    }
}
