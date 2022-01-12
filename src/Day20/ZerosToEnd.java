package Day20;
import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {

       int [] numbers = {10, 0, 5, 0, 1, 0};
        int [] numbers0 = new int[numbers.length];

        for (int i = 0,j=0; i < numbers.length; i++) {
            if (numbers[i]!=0){

                numbers0[j] = numbers[i];
            j++;
            }
        }
        System.out.println(Arrays.toString(numbers0));

    }



}
