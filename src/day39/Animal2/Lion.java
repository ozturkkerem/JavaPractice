package day39.Animal2;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }


    public void hunt(){
        System.out.println(getName() +" ," +getBreed()+" is running fot hunt");
    }



}

/*
5. Create the following sub classes of WildAnimal and Override the hunt method,
 and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile
 */

