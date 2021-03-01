package drugi_tydzien.loops;

public class petle {
    public static void main(String[] args) {

        int i;

        System.out.println("Pierwsza petla");

        for (i = 0; i <= 10; i++) {
            System.out.println("i to =" + i);
        }
        System.out.println("Druga petla");
        for (int number1 = 0, number2 = 9; number1 <= 9; number1++, number2--) {
            System.out.println("NUMBER1 = " + number1 + " " + "NUMBER2 = " + number2);
        }
        System.out.println("Trzecia petla");
        int x = 0;
        while (x != 10) {
            x++;
            System.out.println(x);
        }
        System.out.println("Czwarta petla");
        int numberC = 6;
        do {

            System.out.println("Zmienna =" + numberC);
            numberC++;
        } while (numberC < 12);


    }
}

