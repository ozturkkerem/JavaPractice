package Day07;
import java.util.Scanner;

public class GradeLevelDeter {
    public static void main(String[] args) {

        System.out.println("Please choose a number between 0 ~ 19");
        Scanner input = new Scanner(System.in);
        byte grade = input.nextByte();
        String typeOfSchool = "x";
        if (grade >= 1 || grade <= 5){

            typeOfSchool = "Elementery School";
        }
        else if (grade >= 6 || grade <= 8){
            typeOfSchool = "Middle School";
        }
        else if (grade >= 9 || grade <= 12){
            typeOfSchool = "High School";
        }
        else if (grade >= 13 || grade <= 16){
            typeOfSchool = "College";
        }
        else if (grade >= 17 || grade <= 18){
            typeOfSchool = "Grad School";
        }
        else{
            System.out.println("Wrong number ");
        }

        System.out.println("typeOfSchool = " + typeOfSchool);
    }
}
