package Day09;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        System.out.println("Please write the age of the person");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String group = "infant";

        if (number > 0 && number < 3)
            group = "infant";
        else if (number > 2 && number < 6)
            group = "Toddler";
        else if (number > 5 && number < 10)
            group = "Kid";
        else if (number > 9 && number < 13)
            group = "Pre-teen";
        else if (number > 12 && number < 18)
            group = "Teenager";
        else if (number > 17 && number < 21)
            group = "Young Adult";
        else if (number > 20 && number < 40)
            group = "Adult";
        else if (number > 39 && number < 50)
            group = "Young Middle - Aged Adult";
        else if (number > 49 && number < 55)
            group = "Middle-Aged Adult";
        else if (number > 54 && number < 65)
            group = "Very Young Senior Citizen";
        else if (number > 64 && number < 75)
            group = "Young Senior Citizen";
        else if (number > 74 && number < 85 )
            group = "Senior Citizen";
        else if (number > 84){
            group = "Old Senior Citizen";
        }

        System.out.println(group);
    }
    }