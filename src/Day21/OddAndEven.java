package Day21;

import java.util.Arrays;

public class OddAndEven {
    public static void main(String[] args) {



        int [] numbers = {654,43,2,1,987,56,4,4234,21,324,54,5676,6,78,56,6,4,54,34212,12,65,67,33,24,78,13,41,980};
        int [] even = new int[numbers.length];
        int [] odd = new int[numbers.length];
        Arrays.sort(numbers);
        int i = 0;
        for (int eve:numbers
             ) {
            if (eve%2==0) {
                even[i] = eve;
                i++;
            }
        }
        int j = 0;
        for (int eve:numbers
        ) {
            if (eve%2!=0) {
                odd[j] = eve;
                j++;
            }
        }



        System.out.println("even numbers: " + Arrays.toString(Arrays.copyOf(even,i)));
        System.out.println("odd numbers: " + Arrays.toString(Arrays.copyOf(odd,j)));

    }
}
