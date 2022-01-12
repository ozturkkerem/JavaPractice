package Day24;

import java.util.Arrays;

public class arraysExercise2 {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        int [] arr2 = {4,5,6,7};
        int num = 4;
        int [] rray = {10, 20, 30, 40, 50, 60};
//int [] arr1 = addElement(arr,num);
        System.out.println(Arrays.toString(addElement(arr,num)));
        System.out.println(Arrays.toString(mergeArray(arr,arr2)));
        System.out.println(Arrays.toString(reverseArray(arr)));
        System.out.println((contain(arr2, num)));
        System.out.println(Arrays.toString(remove(rray, 1)));

    }

    public static int [] addElement(int [] numbers, int num ){
            int [] b = new int[numbers.length+1];
        for (int i = 0; i <= numbers.length-1; i++) {
            b[i] = numbers [i];


        }
        b[numbers.length] = num;


        return b;
    }
    public static int [] mergeArray (int [] nums1, int [] nums2){
        int [] merge = new int[nums1.length+nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }


        for (int i = nums1.length, j = 0; i < merge.length ; i++, j++) {
            merge[i]= nums2[j];
        }



        return  merge;
    }
    public static int [] reverseArray (int [] nums1){
        int [] reverseArray = new int[nums1.length];
        int i = nums1.length-1;
        for (int num:nums1) {

            reverseArray[i]=num;
            i--;


        }
        return reverseArray;



    }
    public static boolean contain (int [] numbers, int num){
        boolean isContain = false;

        for (int n:numbers) {
            if (n == num)
            isContain = true;
        }






        return isContain;
    }
    public static int [] remove(int [] numbers, int num ){
        int [] result = new int[numbers.length-1];

        for (int i = 0,j = 0; i < numbers.length-1; i++, j++){

            if (j==num)
                j++;
            result [i]=numbers[j];


        }




        return result;
    }
}
