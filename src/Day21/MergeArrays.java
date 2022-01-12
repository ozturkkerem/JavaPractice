package Day21;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int [] arr1 = {30, 10, 20};
        int [] arr2 = {15, 40, 25, 35};
        int [] arr3 = {8, 9, 17, 5, 4, 1};
        int [] merge = new int[arr1.length+arr2.length+ arr3.length];
        int i=0;
        for (int num:arr1
             ) {
            merge[i]=num;
            i++;
        }
        for (int num:arr2
        ) {
            merge[i] = num;
            i++;

        }
        for (int num:arr3
        ) {
            merge[i] = num;
            i++;


        }
        System.out.println(Arrays.toString(merge));
        }
}
