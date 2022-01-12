package day28;

import java.util.ArrayList;
import java.util.Collection;

public class MaxAndMinNumber {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        Integer max = list.get(0);
        Integer min = list.get(0);
        for (Integer each : list) {

            if (each>max)
            max=each;
            if (each<max)
                min=each;


        }
        System.out.println("max number is: "+  max);
        System.out.println("min number is: "+  min);



    }
}
/*


5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5


 */