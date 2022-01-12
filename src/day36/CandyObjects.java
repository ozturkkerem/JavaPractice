package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyObjects {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Sulugoz",10,0.0,false);
        Candy candy2 = new Candy("Olips",10,1,false);
        Candy candy3 = new Candy("Halka",5,5,true);
        Candy candy4 = new Candy("mint",7,9,true);
        Candy candy5 = new Candy("black",4,2,false);

        Candy [] arr= {candy1,candy2,candy3,candy4,candy5};


        System.out.println(candy1);

        ArrayList<Candy> list = new ArrayList<>(Arrays.asList(arr));

        for (Candy candy : list) {

            System.out.println(candy.getBrand() +"  "+ candy.getPrice());

        }


    }
}

/*

        1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */