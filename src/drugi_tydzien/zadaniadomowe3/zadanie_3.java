package drugi_tydzien.zadaniadomowe3;

public class zadanie_3 {
    public static void main(String[] args) {
        int[][][][][] tab = new int[2][2][2][2][2];
        int value = 1;
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                for (int z = 0; z < 2; z++) {
                    for (int q = 0; q < 2; q++) {
                        for (int w = 0; w < 2; w++) {

                            tab[x][y][z][q][w] = value;
                            value++;
                            System.out.print(tab[x][y][z][q][w] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
