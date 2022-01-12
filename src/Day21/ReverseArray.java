package Day21;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int [] reNumbers = new int[numbers.length];

        int i = numbers.length-1;
        for (int number: numbers
             )

        {

            reNumbers[i]=number;
            i--;
        }
        System.out.println(Arrays.toString(reNumbers));

    }
}
