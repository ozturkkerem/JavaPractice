package day38.animal;

public class Cat extends Animal {


    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }


    @Override
    void eat() {
        System.out.println(name +" "+breed + " is eating cat food");;
    }
}
