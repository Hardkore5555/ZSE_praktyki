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

        System.out.println("piata petla-Tabliczba mnożenia");
        for (int l = 1; l < 11; l++) {
            System.out.println(i + " przejscie petli");
            for (int j = 1; j < 11; j++) {
                System.out.println(" [l:" + l + "]" + "[j:" + l + "]\t " + l + " * " + l + " = " + l * j + "\t");
            }
        }
        System.out.println("szosta petla");
        for (int z = 0; z <= 20; z++) {
            for (int y = 0; y <= 5; y++) {
                System.out.println(" x+y = " + (x + y));
            }
        }
    }
}


