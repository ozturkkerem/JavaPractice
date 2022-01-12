package Day11;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        System.out.println("Please provide number of floor:");
        Scanner input = new Scanner(System.in);
        int floor = input.nextInt();
//solution 1
        if (floor >= 1 && floor <= 3) {
            if (floor == 1)
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            else if (floor == 2)
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            else System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");

        } else
            System.out.println("Invalid Floor");
        System.out.println("----------------------------------------------------------");

        switch (floor){

            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;

            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            break;

            default:
                System.out.println("Invalid floor");

        }
        System.out.println("-----------------------------------------------------");
        if (floor >= 1 && floor <= 3){
            switch (floor) {

                case 1:
                    System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                    break;

                case 2:
                    System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                    break;
                default:
                    System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }
        else
            System.out.println("Invalid floor");



    }
}
