package day30;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfTheDifferent {
    public static void main(String[] args) {

        int [] sumOfDifferences = {2, 1, 10};

        int [] listOrder = new int[sumOfDifferences.length];
        int result = 0;

        Arrays.sort(sumOfDifferences);



        for (int i = sumOfDifferences.length - 1,  j = 0; i >= 0; i--, j++) {

            listOrder[j] = sumOfDifferences[i];

        }
          System.out.println(Arrays.toString(listOrder));



         System.out.println(Arrays.toString(sumOfDifferences));

        for (int i = 0; i < listOrder.length-1; i++) {

            //    System.out.println("list order "+ listOrder[i] );

            result += listOrder[i]-listOrder[i+1];


        }




    }
}
