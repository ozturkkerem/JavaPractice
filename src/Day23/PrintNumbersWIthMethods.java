package Day23;

public class PrintNumbersWIthMethods {

    public static void main(String[] args) {

        int age = 24;
        String citizenShip = "USA";
        int score = 80;
        double radious = 1.5;
        int lengthOfSquare = 10;
        double money = 100;
        double weight = 10;
        int number = -1;
        String strForChar = "kerem is away";
        String [] strForArray = {"I", "will" ,"not" ,"wake", "up", "early" ,"tomorrow"};
        String matOpe = "+";
        String [] fullName = {"keRem","oztuRk"};
        String anagram1 = "silent";
        String anagram2 = "listen";

        printOdd();
        printEven();
        isEligibleAlcohol(age);
        isEligibleVote(age,citizenShip);
        gradeOfTheStudent(score);
        areaOfTheCircle(radious);
        areaOfTheSquare(lengthOfSquare);
        dollarToEuro(money);
        dollarToLira(money);
        weightConvert(weight);
        checkTheNumber(number);
        printChar(strForChar);
        printEachElement(strForArray);
        calculator(age,score,matOpe);
        printFullName(fullName);
        checkIfAnagram(anagram1,anagram2);


    }


    public static void printOdd() {
        System.out.println("Odd numbers: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("\n---------------------------------------------");


    }

    public static void printEven() {
        System.out.println("Even Numbers: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n---------------------------------------------");
    }

    public static void isEligibleAlcohol(int x){
        if (x>20)
            System.out.println("eligible to buy alcohol");
        else
            System.out.println("Not eligible to buy alcohol");
        System.out.println("---------------------------------------------");
    }

    public static void isEligibleVote(int x,String citizen){
        if (x>18 && citizen.equalsIgnoreCase("USA")){
            System.out.println("Eligible to vote");
        }
        else System.out.println("He or she is not eligible for vote");
        System.out.println("---------------------------------------------");
    }

    public static void gradeOfTheStudent(int a){

        String result = (a>=90)? "Grate" :(a>=70)? "Good" : (a>=50)? "pass" :"fail";
        System.out.println("Grade: "+result);

        System.out.println("--------------------------------------");
    }

    public static void areaOfTheCircle(double number){
        System.out.println("Area of the Circle: "+ number*number*3.14);
        System.out.println("------------------------------------");
    }

    public static void areaOfTheSquare(int x){
        System.out.println("The area os square is: " + x*x);
        System.out.println("---------------------------------");
    }

    public static void dollarToEuro(double a){
        System.out.println("Dollar to the euro: " + a*0.84);
        System.out.println("------------------------------");



    }

    public static void dollarToLira(double a){
        System.out.println("Dollar to the euro: " + a*13.79);
        System.out.println("------------------------------");



    }

    public static void weightConvert(double weight){
        System.out.println("kg to lb: "+weight*2.205);
        System.out.println("----------------------------");

    }

    public static void checkTheNumber(int number){
        if (number>0)
            System.out.println(number + "  positive");
        else if (number==0)
            System.out.println(number + "is 0");
        else System.out.println(number + "   Negative");

        System.out.println("--------------------------------------");

    }

    public static void printChar(String str){

        for (int i = 0; i <= str.length()-1; i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println("---------------------------------------");
    }

    public static void printEachElement(String [] str){
    for (int i = 0; i <= str.length-1; i++) {
        System.out.print(str[i]+"--");
    }
    System.out.println("\n----------------------------");
}

    public static void calculator(int num1, int num2, String matOpe){

    int result = matOpe.equals("+")? num1+num2: matOpe.equals("-")?num1- num2:matOpe.equals("*")?num1*num2:num1/num2;
    System.out.println(result);
    System.out.println("----------------------------------------");
}

    public static void printFullName(String[]name){
        String fullName = "";

        for (String nam: name) {
            String firstCh = "";
            nam = nam.toLowerCase();
            firstCh += nam.charAt(0);
            firstCh = firstCh.toUpperCase();

            fullName += firstCh+nam.substring(1)+" ";
        }
        System.out.println(fullName);
    }

    public static void checkIfAnagram(String x, String y){
        int count = 0;
        for (int i = 0; i <= x.length()-1; i++){
            String ch = ""+x.charAt(i);
            if (y.contains(ch))
            count++;


        }
        if (count==x.length()&&x.length()==y.length())
            System.out.println("Anagram");
        else System.out.println("not Anagram");

    }

}