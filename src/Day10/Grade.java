package Day10;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {

        System.out.println("What is the alphabet of the grade ");
        Scanner input = new Scanner(System.in);
        char grade = input.next().charAt(0);

        String gradeResult = ((grade != 'E')&& (grade >= 'A' && grade <= 'F'))? (grade == 'A')? "excellent" : (grade == 'B')? "great Job" : (grade == 'C')? "good"
        : (grade == 'D')? "passed" : "Failed": "Invalid";

        System.out.println(gradeResult);


    }

}
