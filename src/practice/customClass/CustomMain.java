package practice.customClass;

public class CustomMain {


    public static void main(String[] args) {

    /*
        What is OBJECT?
            - Instance of Class
            - Objects has its own memory
            - We can not create OBJECT without Class
            Car             c               =               new                              Car();
         Class         Object                              keyword to create Object        Constructor
         */


        // Create a OBJECT CustomClass

        CustomClassIntro c=new CustomClassIntro();
        System.out.println("c = " + c);
        System.out.println("================1");

        // Call instance Variable
        c.instanceVariable="Instance Variable From Main Class";
        System.out.println("c = " + c);
        System.out.println("================2");

// Call setInfo
        c.setInfo("Instance Variable From SetInfo");
        System.out.println("c = " + c);
        System.out.println("================3");

        // Call staticVariable
        CustomClassIntro.staticVariable="Static Variable From Main Class via ClassName";
        //c.staticVariable="Static Variable From Main Class via Object";
        System.out.println("c = " + c);
        System.out.println("================4");

        // Call staticmethod
        CustomClassIntro.staticMethod();
        System.out.println("c = " + c);
        System.out.println("================5");

        // Call instanceMethod
        c.instanceMethod();
        System.out.println("c = " + c);
        System.out.println("================6");

        // Create new Object
        CustomClassIntro c1=new CustomClassIntro();
        System.out.println("c1 = " + c1);
        System.out.println("================7");

        // Create new Object
        CustomClassIntro c2=new CustomClassIntro();
        System.out.println("c2 = " + c2);
        System.out.println("================8");


        CustomClassIntro.staticVariable="Last value from Main Class";
        System.out.println("c = " + c);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

    }
}
