package day39.Animal2;

import java.sql.SQLOutput;

public class Animal {

    private String 	name, breed,size, color;
    private char gender;
    private int age;

    public Animal(String name, String breed, String size, String color, char gender, int age) {

        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }


        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null){
            System.err.println("Breed can not be null");
            System.exit(1);
        }
        if (breed.isEmpty() || name.isBlank()) {
            System.err.println("Invalid Breed");
            System.exit(1);
        }





        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size == null){
            System.err.println("Size can not be null");
            System.exit(1);
        }
        if (size.isEmpty() || name.isBlank()) {
            System.err.println("Invalid Size");
            System.exit(1);
        }




        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null){
            System.err.println("Breed can not be null");
            System.exit(1);
        }
        if (color.isEmpty() || name.isBlank()) {
            System.err.println("Invalid Breed");
            System.exit(1);
        }


        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (!(gender== 'F'||gender== 'f'||gender== 'M'||gender== 'm')) {
            System.out.println(gender + " must me \"f\" or  \"m\"");
            System.exit(1);
        }
        this.gender = gender;

    }

    public int getAge() {


        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age<= 0)
        {
            System.out.println(age + " can not be less than 0");
            System.exit(1);
        }


    }

    public void eat(){
        System.out.println(name+" "+ breed+" is eating");
    }

    public void sleep(){
        System.out.println(name+" "+ breed+" is sleeping");
    }

    public void drink(){
        System.out.println(name+" "+ breed+" is drinking");
    }

    public void move(){
        System.out.println(name+" "+ breed+" is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}



/*]
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()


	2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()

	3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()


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


	5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


	6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */
