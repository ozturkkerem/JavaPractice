package Day09;
import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        // Get the grade number from user
        System.out.println("What is the grade? (1 ~ 6)");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        //Write the conditions
        if (grade == 1){
            System.out.println("location -  Apple orchard\n" + "number of groups - 3\n" + "teacher in charge - Ms. Smith");
        }
else if (grade == 2){
            System.out.println("location - Zoo\nnumber of groups - 7\nteacher in charge - Ms Lee");
        }
else if (grade == 3){
            System.out.println("location - Aquarium\nnumber of groups - 5\nteacher in charge - Ms Wilson");
        }
else if (grade == 4){
            System.out.println("location - Movie theater\nnumber of groups - 2\nteacher in charge - Ms Reyes");
        }
else if (grade == 5){
            System.out.println("location - Museum\nnumber of groups - 5\nteacher in charge - Ms Lela");
        }
else if (grade == 6){
            System.out.println("location - Six Flags\nnumber of groups - 8\nteacher in charge - Mr. Watt");
        }

    }
}
