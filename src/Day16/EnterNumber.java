package Day16;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class EnterNumber {

    public static void main(String[] args) {

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int number = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i < 5; i++){

            System.out.println("Enter number: ");
            if(number >0)
                positive++;
            else if (number<0)
                negative++;
                        else
                            zero++;

        }
            scan.close();
        System.out.println(positive + " positive and " + negative + " negative");


    }
}
