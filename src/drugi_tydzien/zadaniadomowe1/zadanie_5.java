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
            j -= 3;
        } while (j >= 0);
        //*

        for (int x = 1; x < 11; x++) {
            int z=11;
            z=z-x;
            System.out.println();
            for (int y = 1; y < 11; y++) {
                int lgw = y*2-1;
                char p = ' ';
                if (y==x||y==z){
                    System.out.print(p);
                }
                else {
                    System.out.print("*");
                }
            }
        }
    }
}