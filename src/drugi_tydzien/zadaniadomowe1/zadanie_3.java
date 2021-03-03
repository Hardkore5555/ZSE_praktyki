package drugi_tydzien.zadaniadomowe1;

public class zadanie_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " przejscie petli");
            for (int j = 1; j < 11; j++) {
                int x = i * j;
                if (x % 2 == 0) {
                    System.out.println(" [i:" + i + "]" + "[j:" + i + "]\t " + i + " * " + i + " = " + x + "\t");
                    //System.out.println("X\n");
                }
                else {
                    System.out.println(" [i:" + i + "]" + "[j:" + i + "]\t " + i + " * " + i + " = X"+"\t");
                }
            }
        }
    }
}
