package Day21;

import java.util.Arrays;

public class DescendingInteger {
    public static void main(String[] args) {

        int [] numbers = {654,43,2,1,987,56,4,4234,21,324,54,5676,6,78,56,6,4,54,34212,12,65,67,33,24,78,13,41,980};
int [] desNumbers = new int[numbers.length];
        Arrays.sort(numbers);
        int i = numbers.length-1;


        for (int num:numbers
             ) {

            desNumbers[i] = num;
            i--;
        }
        System.out.println("In order the descending: "+ Arrays.toString(desNumbers));
        System.out.println("-------------------------------------------------------");











    }
}
