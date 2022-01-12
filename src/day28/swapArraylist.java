package day28;

import java.util.ArrayList;

public class swapArraylist {
    public static void main(String[] args) {



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

        Integer temp = list1.get(0);
        list1.set (0,list1.get(list1.size()-1));
        list1.set(list1.size()-1,temp);

        System.out.println(list1);
        System.out.println(temp);





        /*
        2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
         */

    }
}
