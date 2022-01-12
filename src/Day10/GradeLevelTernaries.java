package Day10;

import java.util.Scanner;

public class GradeLevelTernaries {
    public static void main(String[] args) {
        System.out.println("Please write number of the grade: ");
        Scanner input = new Scanner(System.in);
        byte grade = input.nextByte();
        String gradeLevel = "";
        //Make the first condition

            gradeLevel =(grade >= 1 && grade <= 18)?  (grade >= 17)? "Grad School" : (grade >= 13) ? "College" : (grade >= 9)? "High School" :
                    (grade >= 6)? "Middle School" : "Elementary School" : "Invalid grade level";

        System.out.println(gradeLevel);
        }

    }
