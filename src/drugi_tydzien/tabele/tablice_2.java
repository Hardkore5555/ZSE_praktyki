package drugi_tydzien.tabele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class tablice_2 {
    public static void main(String[] args) {
        //tablica dwuwymiarowa
        int[][] twoarray = new int[10][20]; //10*20 = 200 elementów w tablicy
        //tablica trójwymiarowa
        int[][][] threearray = new int[5][10][20];//5*10*20 = 1000 elementów w tablicy

        twoarray[0][0]=1;

        System.out.println("twoarray = "+twoarray[0][0]);

        int[][] array2 = new int[10][10];
        int value = 1;
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                array2[i][j]= value;
                value=value+2;
                System.out.println(array2[i][j]+ "\t");
            }
            System.out.println();
        }

        int [][][] array3 = new int[3][3][3];
        int value2 = 0;
        for (int x = 0;x<3;x++){
            for (int y = 0;y<3;y++){
                for (int z = 0;z<3;z++){
                    array3[x][y][z] = value2;
                    value2+= 3;
                    System.out.println("["+ x + "][" + y + "][" + z + "] = " + array3[x][y][z] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Wpisywanie tablicy: ");
        String[] owoce = new String[3];
        owoce[0]="Mango";
        owoce[1]="Banan";
        owoce[2]="Gruszka";
        System.out.println(Arrays.toString(owoce));
        System.out.println(owoce[0]+", "+owoce[1]+", "+owoce[2]);

        System.out.println("Wypisywanie listy: ");
        ArrayList<String> lista_owocow = new ArrayList<>();
        lista_owocow.add("Mango");
        lista_owocow.add("Banan");
        lista_owocow.add("Gruszka");
        System.out.println(lista_owocow);
        //Stworzenie listy
        ArrayList<String> lista_owocow2 = new ArrayList<>();
        lista_owocow2.add("Truskawka");
        lista_owocow2.add("Banan");
        lista_owocow2.add("Gruszka");
        lista_owocow2.add("Jabłko");
        System.out.println(lista_owocow2);

        //Dodanie nowego obiektu do listy
        lista_owocow2.add(1,"Maracuja");
        System.out.println(lista_owocow2);
        //Usuwanie obiektu z listy
        lista_owocow2.remove("Banan");
        lista_owocow2.remove(2);
        System.out.println(lista_owocow2);
        //Nadpisywanie obiektów w liście
        lista_owocow2.set(0,"Arbuz");
        System.out.println(lista_owocow2);
        //Sortowanie listy
        Collections.sort(lista_owocow2);
        System.out.println(lista_owocow2);
        //Czyszczenie listy
        lista_owocow2.clear();
        System.out.println(lista_owocow2);


    }
}
