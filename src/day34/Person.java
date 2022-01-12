package day34;

public class Person {

    public String name,language;
    public int age;


    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    static {
        planet = "word";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;


    }

    public static void printPlanetName(){
        System.out.println("Planet name is  " + planet);
    }


    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }





    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", planet=" + planet +
                ", is it Human= " + isHuman +
                ", has Nose =" + hasNose +
                ", number of head =" + numberOfHead +
                ", number of Wings=" + numberOfWings +
                '}';
    }
}



/*

    2. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()




 */