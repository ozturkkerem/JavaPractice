package Day24;

public class x {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3,34,2};
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE H

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            for (int each : nums) {
                if (each == nums[i])
                    count++;
                each = i;
            }
            if (count == 1)
                System.out.println(nums[i]);
        }


    }
}