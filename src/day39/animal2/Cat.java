package day39.animal2;

public class Cat extends FriendlyAnimal{


    public Cat(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getName()+" ,"+getBreed()+" is scratching something");
    }

    public void meow() {
        System.out.println(getName() + " ," + getBreed() + " is meowing");
    }
    public void eat() {
        System.out.println(getName() +" ," +getBreed()+" is eating a cat food");
    }


}


/*
2. Cat:
					Extra methods:
						scratch()
						meow()
 */
