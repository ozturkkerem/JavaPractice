package Day19;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("How much you make an hour?");
            int salH = scan.nextInt();
            if (salH < 1) {

                System.out.println("Invalid entry for hourly rate");
                System.exit(0);
            }
            System.out.println("How many hour do you work per a week?");
            int hourW = scan.nextInt();
            if (hourW < 2 || hourW > 144) {
                System.out.println("Invalid entry for weekly work");
                System.exit(0);
            }
            System.out.println("Enter your  tax rate");
            double taxR = scan.nextDouble();
            if (taxR < 0 || taxR > 10) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            int gSalary= salH *hourW * 4;
            taxR = taxR / 100;
            double federalTax = gSalary * (taxR);
            double stateTax = gSalary * 0.26;
            double totalTax = stateTax + federalTax;
            double netIncome = gSalary -totalTax;

            System.out.println("Gross Salary: " + gSalary + "\nFederal tax "+ federalTax + "\nState Tax: " + stateTax
            + "\nTotal Tax: " + totalTax + "\nNet Income: " + netIncome);
            System.out.println("Would you like to continue?");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no")))
            {
                System.out.println(" Invalid Entry");
                System.exit(0);
            }
            if (a.equalsIgnoreCase("yes"))
                continue;
            else
                break;


        }


        }
            }

