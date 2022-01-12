package day30;

import java.util.ArrayList;
import java.util.Arrays;

public class PcStore {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();
        Laptop laptop4 = new Laptop();

        laptop1.setInfo("Hp",15,"Windows","i7",8000);
        laptop2.setInfo("Dell",17,"Windows","i7",16000);
        laptop3.setInfo("MacBook",14,"IOS","I5",4000);
        laptop4.setInfo("Toshiba",15,"Windows","i5",4000);


       // Laptop [] laptop = {laptop1,laptop2,laptop3};
        ArrayList <Laptop> list = new ArrayList<>(Arrays.asList(laptop1,laptop2,laptop3,laptop4));

        for (Laptop laptop : list) {
            if (laptop.size>14)
                System.out.println(laptop.brand);
        }



    }
}
