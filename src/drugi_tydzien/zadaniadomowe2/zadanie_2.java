package drugi_tydzien.zadaniadomowe2;

import java.util.Arrays;
import java.util.Collections;

public class zadanie_2 {
    public static void main(String[] args) {
        String[] stringArray = {"a","b","c","d","e","f","g","h","i","j"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(stringArray));
    }
}
