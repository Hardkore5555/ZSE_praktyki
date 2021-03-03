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
    }
}
