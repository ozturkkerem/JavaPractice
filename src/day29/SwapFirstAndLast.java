package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapFirstAndLast {
    public static void main(String[] args) {


        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));


        Collections.swap(list,-0,list.size()-1);

        System.out.println(list);
        System.out.println("---------------------------------");



        ArrayList <Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        list2.removeAll(Arrays.asList(0,1));


    }

}
