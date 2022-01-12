package Day10;

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {

        System.out.println("Please provide level of oxygen you have");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String status = "";

        if ((number >= 0) && (number <= 100)) {
            if (number >= 90)
                status = "Your tank is full";
            else if (number >= 80)
                status = "Still okay";
            else if (number >= 70)
                status = "Don't go too far";
            else if (number >= 60)
                status = "Start to head back";
            else
                status = "Be careful now you at %50";
        }
        else {
            System.out.println("Invalid Number");
        }

            System.out.println(status);

    }
}

