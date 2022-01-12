package Day06;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {


        System.out.println("Please enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int remainerYear = year % 4;
        if (remainerYear == 0) {
            boolean leapYear = true;
            System.out.println(year + " is leap year: " + leapYear);
        } else if (remainerYear != 0) {
            boolean leapYear = false;
            System.out.println(year + " is leap year: " + leapYear);
        }

    }
}
