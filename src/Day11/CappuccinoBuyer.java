package Day11;

import java.util.Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        System.out.println("What size coffee do you want?");
        Scanner input = new Scanner(System.in);
        String coffeeSize = input.next();
//solution 1
        if (coffeeSize.equals("tall") || coffeeSize.equals("grande") || coffeeSize.equals("venti")) {

            if (coffeeSize.equals("tall")) {
                System.out.println("price is $3.69\n90 calories");
            } else if (coffeeSize.equals("grande")) {
                System.out.println("price is $3.99\n120 calories");
            } else {
                System.out.println("price is $4.29\n150 calories");

            }


        } else System.out.println("Invalid Size");
//solution 2

        System.out.println("-----------------------------------------------------------------");

        switch (coffeeSize){
            case "tall":
                System.out.println("price is $3.69\n90 calories");
            break;

            case "grande":
                System.out.println("price is $3.99\n120 calories");
                break;

            case "venti":
                System.out.println("price is $4.29\n150 calories");
                break;

            default:
                System.out.println("Invalid Size");


        }
        System.out.println("------------------------------------------------------------------");
//solution 3
        if (coffeeSize.equals("tall") || coffeeSize.equals("grande") || coffeeSize.equals("venti")) {
            switch (coffeeSize) {
                case "tall":
                    System.out.println("price is $3.69\n90 calories");
                    break;

                case "grande":
                    System.out.println("price is $3.99\n120 calories");
                    break;

                default:
                    System.out.println("price is $4.29\n150 calories");

            }
        }

        else{
            System.out.println("Invalid Size");
        }

    }
}
