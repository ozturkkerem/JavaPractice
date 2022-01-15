package day39.animal2;

public class Python extends WildAnimal {


    public Python(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void hunt(){
        System.out.println(getName() +" ," +getBreed()+" is  crawling");
    }




}

/*
	5. Python
				6. Crocodile
 */