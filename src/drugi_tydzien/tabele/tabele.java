package drugi_tydzien.tabele;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tabele {
    public static void main(String[] args) {
        int[] array = {1,45,56,-23};
        int array2[] = {-7,6,52,2,100,0,777};

        System.out.println("Element pierwszy tablicy array[0]: "+array[0]);
        System.out.println("Długość tablicy array: "+array.length);
        System.out.println("Element pierwszy tablicy array2[0]: "+array2[0]);
        System.out.println("Długość tablicy array2: "+array2.length);

        System.out.println("\n\nTablica array przed zmianą: "+ Arrays.toString(array));

        array[0]=15;
        array[1]=10;
        array[2]=5;
        array[3]=0;
    }
}
