package day33;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static boolean hasWing = true;
    public static int numberOfHead = 1;
    public static int eyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void eat(){
        System.out.println(name + " is eating food");

    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){

        System.out.println(name+ "is sleeping");
    }

    public void isHuman(){

        System.out.println("human : " +isHuman);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", is human =" + isHuman +
                '}';
    }
}

/*

3. Person Task:
		1. Create a class named Person:
				Attributes:
					instance: name, age, gender
					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
				Add a constructor that can set All the fields (instances)

				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()


 */