package Day22;

import java.util.Arrays;

public class Reverse2Dim2 {
    public static void main(String[] args) {

        int[][] array2D = {{1, 2, 3}, {4, 5,6}};

        int[][] reverse = new int[array2D.length][];

        for (int i = 0; i < array2D.length; i++) {
            int[] temp = new int[array2D[i].length];
            for (int j = 0; j < array2D[i].length; j++) {
                temp[temp.length-1-j] = array2D[i][j];

            }
            reverse[array2D.length-1-i]= temp;
        }
        System.out.println(Arrays.deepToString(reverse));

    }


}