package Day10;
import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {

        System.out.println("What is the age of the person? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String agegroup = "";
        if(age > 0 && age < 150 ){
            if (age < 21)
                agegroup = "Teenager";
            else if (age >= 21 && age <55)
                agegroup = "Adult";
            else
                agegroup = "Senior";

        }else
            System.out.println("Invalid");
        System.out.println(agegroup);

    }
}
