package drugi_tydzien.tabele;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class tabele {
    public static void main(String[] args) {
        int[] array = {1, 45, 56, -23};
        int array2[] = {-7, 6, 52, 2, 100, 0, 777};

        System.out.println("Element pierwszy tablicy array[0]: " + array[0]);
        System.out.println("Długość tablicy array: " + array.length);
        System.out.println("Element pierwszy tablicy array2[0]: " + array2[0]);
        System.out.println("Długość tablicy array2: " + array2.length);

        System.out.println("\n\nTablica array przed zmianą: " + Arrays.toString(array));

        array[0] = 15;
        array[1] = 10;
        array[2] = 5;
        array[3] = 0;

        int array3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("\n\narray3 = {");
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length - 1) {
                System.out.println(array3[i] + "};");
            } else {
                System.out.println(array3[i] + ", ");
            }
        }
        int intArray[] = {6, 1, 5, 2, 8, 10, 4, 3, 7, 9};
        Arrays.sort(intArray);
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(intArray));
        Integer intArrays[] = {6, 1, 5, 2, 8, 10, 4, 3, 7, 9};
        Arrays.sort(intArrays, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(intArrays));

        /*
        Składnia funkcji sort()
        sort(nazwaTablicy, początkowyIndex, końcowyIndex)
        początkowyIndex - (włącznie)
        końcowyIndex - (bez niego/z wyłączeniem)
         */
        Integer intArray2[] = {6, 1, 5, 2, 8, 10, 4, 3, 7, 9};
        Arrays.sort(intArray2, 2, 8);
        System.out.println("Sortowanie z zakresem: " + Arrays.toString(intArray2));
        char[] charArray = {'z', 'w', 'j', 'e', 'g', 's', 'p', 'q', 'm', 'a', 'c', 'o', 'f'};
        Arrays.sort(charArray);
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(charArray));
        Character[] charArray2 = {'z', 'w', 'j', 'e', 'g', 's', 'p', 'q', 'm', 'a', 'c', 'o', 'f'};
        Arrays.sort(charArray2, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(charArray2));
        String[] stringArray = {"~", "Ala", "ma", "kota", "."};
        Arrays.sort(stringArray);
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray,Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(stringArray));

        
    }
}

