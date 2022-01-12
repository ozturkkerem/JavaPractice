package Day22;
import java.util.Arrays;
public class Reverse2Dimension {
    public static void main(String[] args) {

        int [][] array2D = { {1,2,3}, {4,5,6}};
        int [][] reverse = new int[array2D.length][array2D[0].length];
        System.out.println(array2D.length);

        for (int i = 0; i <= array2D.length-1 ; i++) {

            for (int j = 0; j <=array2D[i].length-1 ; j++) {

                reverse[(array2D.length-1)-i][(array2D[i].length-1)-j] = array2D[i][j];

            }


        }
        System.out.print(Arrays.deepToString(reverse));




    }
}

