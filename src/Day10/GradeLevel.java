package Day10;

import java.util.Scanner;


public class GradeLevel {
    public static void main(String[] args) {
        System.out.println("Please write number of the grade: ");
        Scanner input = new Scanner(System.in);
        byte grade = input.nextByte();
        String gradeLevel = "";
        //Make the first condition
        if (grade >= 1 && grade <= 18) {
        if (grade >= 17)
        gradeLevel = "Grad School";
        else if (grade >= 13)
            gradeLevel = "College";
        else if (grade >= 9)
            gradeLevel = "High School";
        else if (grade >= 6)
            gradeLevel = "Middle School";
        else
            gradeLevel = "Elementary School";


        } else {
            System.out.println("Invalid grade level");
        }
        System.out.println(gradeLevel);

    }
}
