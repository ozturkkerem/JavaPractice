package Replit.Library.Quiz;

public class Today {


    public static void main(String[] args) {



        try{

            System.out.println(9/0);

        }catch (OutOfMemoryError e){
            System.out.println(" today is friday");
            e.printStackTrace();

        }finally {
            System.out.println("this is finally");
        }



        System.out.println("Test is done");




    }
}
