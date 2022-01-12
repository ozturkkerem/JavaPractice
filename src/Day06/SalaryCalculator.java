package Day06;

public class SalaryCalculator {
    public static void main(String[] args) {

        //variables for calculate salary
        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 0.065;
        double federalTaxRate = 0.262;

        //find the values!

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = stateTaxRate * salaryBeforeTax;
        //int stateTal = (int)stateTax;
        double federalTax = salaryBeforeTax * federalTaxRate;
        federalTax = (int)federalTax;
        double totalTax = stateTax + federalTax;
        int salaryAfterTax = salaryBeforeTax - (int)totalTax;

        //System.out.println("stateTal = " + stateTal);



        //Print it out
        System.out.println("Gross pay is: " + "$" + + salaryBeforeTax);
        System.out.println("federal tax is: " + "$" + (int)federalTax);
        System.out.println("state tax is: " + "$" + (int)stateTax);
        System.out.println("Total tax is: " + "$" + (int)totalTax);
        System.out.println("Net income is: " + "$" + salaryAfterTax);





    }
}
