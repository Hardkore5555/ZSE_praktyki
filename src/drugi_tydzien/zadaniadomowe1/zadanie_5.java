package drugi_tydzien.zadaniadomowe1;

public class zadanie_5 {
    public static void main(String[] args) {
//przerobiony kod z zadania 1
        int i = 0;
        while (i < 20) {
            i += 2;
            System.out.println("i to =" + i);
        }
//przerobiony kod z zadania 2
        System.out.println("Pętla 2\n");
        int j = 30;
        do {
            System.out.println("j to =" + j);
            j-=3;
        } while (j >= 0);
    }
}