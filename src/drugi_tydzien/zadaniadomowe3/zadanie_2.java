package drugi_tydzien.zadaniadomowe3;

import java.util.Random;

public class zadanie_2 {
    public static void main(String[] args) {
        int[][][][] tab = new int[3][3][3][3];
        int value = 1;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    for (int q = 0; q < 3; q++) {


                        tab[x][y][z][q] = value;
                        value++;
                        System.out.print(tab[x][y][z][q] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

