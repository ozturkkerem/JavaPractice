package day39.animal2;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void bark(){
        System.out.println(getName() +" ," +getBreed()+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName() +" ," +getBreed()+" is eating a Dog food");
    }

}

/*
	4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */
