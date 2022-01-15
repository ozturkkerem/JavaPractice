package day39.Animal2;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void swim(){
        System.out.println(getName() +" ," +getBreed()+" is swimming in the poor");
    }


    public void eat() {
        System.out.println(getName() +" ," +getBreed()+" is eating some fish");
    }

}
