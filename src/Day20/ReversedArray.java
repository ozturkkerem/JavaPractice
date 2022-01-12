package Day20;
import java.util.Arrays;
public class ReversedArray {
    public static void main(String[] args) {


       int [] numbers = {1,2,3,4,5};
        int [] numbersR = new int[5];
       for (int i = numbers.length-1,j = 0; i >= 0; i--, j++){

           numbersR [j] = numbers[i];




       }
        System.out.println(Arrays.toString(numbersR));

    }

}
