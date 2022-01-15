package day39.animal2;

public class Parrot extends FriendlyAnimal {

    public Parrot(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void fly(){
        System.out.println(getName() +" ," +getBreed()+" is flying on the garden");
    }

    public void sing(){
        System.out.println(getName() +" ," +getBreed()+" is singing ");
    }

    public void eat() {
        System.out.println(getName() +" ," +getBreed()+" is eating bird food");
    }


}


/*
		4. Parrot:
					Extra methods:
						fly()
						sing()
 */
