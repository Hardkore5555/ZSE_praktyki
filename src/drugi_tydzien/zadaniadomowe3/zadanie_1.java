package drugi_tydzien.zadaniadomowe3;

public class zadanie_1 {
    public static void main(String[] args) {

        int[][] tab = new int[5][5];
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tab[i][j] = value;
                value++;
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
    }
}


