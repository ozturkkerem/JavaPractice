package Replit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int one = 5;
        int two = 4;
        Calc a = new Calc();
        a.setX(one);
        a.setY(two);
        a.plus();
        System.out.println(a.getResult());
        a.minus();
        System.out.println(a.getResult());
    }
}



