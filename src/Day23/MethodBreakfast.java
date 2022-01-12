package Day23;

public class MethodBreakfast {
    public static void main(String[] args) {

   initialsOFTHePerson("kerem ozturk");
domainOfTheEmail("ozturk.kerem@live.com");
nameOfTheMonths(1);
        nameOfTheDays(1);
        numberOfTheMonth(1);
    }
    public static void domainOfTheEmail (String email){
        int chAtt = email.indexOf("@")+1;
        int chDat = email.lastIndexOf(".");
        System.out.println(email.substring(chAtt,chDat));
    }
    public static void initialsOFTHePerson(String name){
        String fChar = name.charAt(0)+" ";
        String sChar = name.charAt(name.indexOf(" ")+1)+" ";
        System.out.println(fChar.toUpperCase()+sChar.toUpperCase());



        }
    public static void nameOfTheMonths(int number){
        String result = "";


        if (number >= 1 && number <= 12) {
            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "Semtember";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else{
                result = "December";
            }

            System.out.println(result);
        } else {
            System.out.println("The number is invalid");
        }

    }
public static void nameOfTheDays(int n){
    String day = (n == 1)? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
            : (n == 5) ? "Friday" : (n == 6)? "Saturday": "Sunday";


    System.out.println(day);



}
public static void numberOfTheMonth(int number){

    boolean days30 = number == 4 || number == 6 ||  number == 9 || number == 11;
    boolean days28 = number == 2;
    boolean days31 = !days28 && !days30;

    if (days28){
        System.out.println("28 days");
    }
    if (days30){
        System.out.println("30 days");
    }
    if (days31){
        System.out.println("31 days");
    }
}


    }




