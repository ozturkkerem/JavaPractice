package day38.animal;

public class Eagle extends Animal{

    public Eagle(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    void eat() {
        System.out.println(name + " "+ breed + " is eating snake");
    }
}
