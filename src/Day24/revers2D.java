package Day24;

import java.util.Arrays;

public class revers2D {
    public static void main(String[] args) {

        int [] num1 = {1,2,3,4,5,6,7};
        int [] num2 = {8,9,10,11};
        int [] num3 = {12,13,14,15,16};

        int [][]nums = new int[3][];
        nums [0] = num1;
        nums [1] = num2;
        nums [2] = num3;

        for (int i = 0; i < nums.length; i++) {
                int [] temp = new int[nums[i].length];
            for (int j = 0; j < nums[i].length; j++) {
                  temp[nums[i].length-1] = nums[i][j];


            }
          nums[nums.length-1-i]= temp;

        }
        System.out.println(Arrays.deepToString(nums));
    }


}
