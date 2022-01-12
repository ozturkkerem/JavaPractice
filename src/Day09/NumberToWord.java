package Day09;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        System.out.println("Please write a number between 0 ~ 9");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String numberStr = null;
        if (number == 0) {
            numberStr = "Zero";
        } else if (number == 1) {
            numberStr = "One";
        } else if (number == 2) {
            numberStr = "Two";
        } else if (number == 3) {
            numberStr = "Three";
        } else if (number == 4) {
            numberStr = "Four";
        } else if (number == 5) {
            numberStr = "Five";
        } else if (number == 6) {
            numberStr = "Six";
        } else if (number == 7) {
            numberStr = "Seven";
        } else if (number == 8) {
            numberStr = "Eight";
        } else if (number == 9) {
            numberStr = "Night";
            
        }
        System.out.println(numberStr);
    }

}

    

