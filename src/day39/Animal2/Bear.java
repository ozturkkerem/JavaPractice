package day39.Animal2;

public class Bear extends WildAnimal{

    public Bear(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void hunt(){
        System.out.println(getName()+" " +getBreed()+" is hunting by walking in the forest");
    }




}
/*
	4. Bear
				5. Python
				6. Crocodile
 */
