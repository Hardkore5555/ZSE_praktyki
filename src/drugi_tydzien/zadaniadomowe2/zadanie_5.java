package drugi_tydzien.zadaniadomowe2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class zadanie_5 {
    public static void main(String[] args) {
        Integer Array[] = {6, -4, 5, 2, 8, 10, 4, 3, 7, 9, -14, 12, -2, 1, -5, -1, 11, 18, -19, -11};
        Arrays.sort(Array, 0, 19);
        Arrays.sort(Array, 10, 19, Collections.reverseOrder());
        System.out.println("Posortowana tablica:\t"+Arrays.toString(Array));
    }
}

