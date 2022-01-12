package Day20;

import java.util.Scanner;

public class ReverseClassmate {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String [] classmates = new String[10];
        System.out.println("Enter 10 of your classmates full name");
        for (int i = 0; i < classmates.length; i++) {
            String x = scan.nextLine();
            classmates[i]= x;

        }

        for (int i = classmates.length-1; i > 0; i--) {
            System.out.println(classmates[i]);
        }
        scan.close();

    }
}


