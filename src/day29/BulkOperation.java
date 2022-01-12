package day29;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,3,5,5,5,5,8,8,8,8));

        System.out.println(list);

list.retainAll(Arrays.asList(1,2,3,4,5,6));

        System.out.println(list);
        list.removeAll(Arrays.asList(3));
        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList <Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));

        list2.retainAll(Arrays.asList(100,200));

        System.out.println(list2);

        System.out.println("------------------------------------");

ArrayList <String> list3 = new ArrayList<>();

list3.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

list3.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(list3);
        System.out.println("--------------------------------------------");

        ArrayList <Integer> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean t1 = list4.contains(1);
        System.out.println(t1);

        System.out.println("-------------------------------------------");

        String [] names =  {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList <String> list5 = new ArrayList<>(Arrays.asList(names));

        System.out.println(list5);

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList <Integer> list6 = new ArrayList<>();

        list6.addAll(Arrays.asList(arr));

        System.out.println(list6);

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        System.out.println((convertArrayToArrayList(arr1)));


    }

    public static ArrayList <Integer> convertArrayToArrayList(int[] array){

        ArrayList <Integer> list = new ArrayList<>();

        for (int element : array) {
            list.add(element);
        }

        return list;
    }




}
