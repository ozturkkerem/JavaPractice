package day29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

String [] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        //convert it

        ArrayList <String> list = new ArrayList<>(Arrays.asList(countries));

        System.out.println(list);

        list.removeIf( p -> p.length() >= 10);

        System.out.println(list);

        //converting array list to array

        countries = list.toArray( new String[0]);

        System.out.println(Arrays.toString(countries));

        System.out.println("---------------------------------------------");


        String [] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList <String> list1 = new ArrayList<>(Arrays.asList(names));

        list1.removeIf( p -> p.charAt(0)=='M');

        System.out.println(list1);

        names = list1.toArray( new String[0]);

        System.out.println(Arrays.toString(names));

    }
}
