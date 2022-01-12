package Day10;

import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {

        System.out.println("Please write the salary ==> ");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double salaryNoTax = salary;
        System.out.println("Please answer if you are married true-false");
        boolean isMarried = input.nextBoolean();
        //calculate the salary after tax
        if (salary >= 130_000) {
            salary = salary * 0.65;
        } else if (salary >= 100_000) {
            salary *= 0.70;
        } else if (salary >= 80000){
            salary *= 0.75;
        }
        else{
            salary *= 0.80;
        }
        if (isMarried){
            salary += salaryNoTax * 0.05;
        }
        System.out.println(salary);

    }
}
