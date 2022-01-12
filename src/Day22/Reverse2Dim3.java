package Day22;

import java.util.Arrays;

public class Reverse2Dim3 {
    public static void main(String[] args) {

        int [][] numbers = {{1,2,3,4,5,6,7,8,9},{10,11,12,13,14,15,16,17,18}};
        int [][] reverse = new int[numbers.length][numbers[0].length];

        for(int i = 0; i <= numbers.length-1;i++){

for (int j = 0; j<= numbers[i].length-1; j++){

 reverse[(numbers.length-1)-i][(numbers[i].length-1)-j]=numbers[i][j];


}}
        System.out.println(Arrays.deepToString(reverse));
    }
}
/*
        for (int i = 0; i <= array2D.length-1 ; i++) {

            for (int j = 0; j <=array2D[i].length-1 ; j++) {

                reverse[(array2D.length-1)-i][(array2D[i].length-1)-j] = array2D[i][j];
 */