package day39.animal;

public class Dog extends Animal{
    public Dog(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    void eat() {
        System.out.println(name + " " + breed+" is eating cat food");
    }
}
