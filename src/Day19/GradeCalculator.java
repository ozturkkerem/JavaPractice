package Day19;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("Enter your score:");
            int score = scan.nextInt();
            if (score<0||score>100){
                System.out.println("Invalid Entry:");
                System.exit(0);
            }
            String grade = (score>=90)? "A" : (score>=80)? "B" :(score>=70)? "C" : (score>=60)? "D" : "F";
            System.out.println(grade);
            System.out.println("Would you like to continue: ");
            String a= scan.next();
            while(!(a.equalsIgnoreCase("yes"))||a.equalsIgnoreCase("no")){
                System.out.println("Invalid Entry, Please re-enter");
                a= scan.next();
            }
            if (a.equalsIgnoreCase("yes"))
                continue;
            else
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);

        }

    }
}
