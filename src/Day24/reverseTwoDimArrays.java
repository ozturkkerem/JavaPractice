package Day24;

import java.util.Arrays;

public class reverseTwoDimArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] arr3 = {8,9,10,11,12,13};

        int [][] arr2D = new int[3][];
        arr2D[0]= arr1;
        arr2D[1]= arr2;
        arr2D[2]= arr3;

        int [][] result = new int[arr2D.length][];

        for (int i = 0; i < arr2D.length; i++) {

            int [] temp = new int[arr2D[i].length];


            for (int j = 0; j <arr2D[i].length ; j++) { // 3

                temp[(temp.length-1)-j]=arr2D[i][j];
                System.out.println(temp.length-1);
            }
            result [(arr2D.length-1)-i] = temp;
        }
      //  System.out.println(Arrays.deepToString(result));






    }
}



/*1. Write a program that can reverse a two dimensional array (return new array)
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] arr3 = {8,9,10,11,12,13};

 */