package day28;

import java.util.ArrayList;

public class multiplyEachOddNumber {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

int index = 0;
        for (Integer element : list) {


            if (element%2!=0){
                element*= 2;
                list.set(index,element);
            }
              index++;
        }

        System.out.println(list);


    }


}
/*
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

 */