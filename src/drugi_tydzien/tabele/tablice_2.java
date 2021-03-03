package drugi_tydzien.tabele;

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


    }
}
