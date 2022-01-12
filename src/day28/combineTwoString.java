package day28;

import java.util.Arrays;

public class combineTwoString {
    public static void main(String[] args) {


        String [] arr1 = {"A", "B", "C"};

        String [] arr2 = {"D", "E", "F", "G"};

        String [] arr3 = new String[arr1.length+ arr2.length];

        int i = 0;
        for (String s : arr1) {
            arr3 [i++] = s;
        }
        for (String s : arr2) {
            arr3 [i++] = s;
        }

        System.out.println(Arrays.toString(arr3));




    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}




 */