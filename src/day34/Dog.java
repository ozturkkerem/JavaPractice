package day34;

public class Dog {


    public String breed, color;

    public char gender,size;

    public boolean isFriendly;

    public static int numberOfLegs, numberOfEyes,numberOfWings;


    public Dog(String breed, String color, char gender, char size, boolean isFriendly) {
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.isFriendly = isFriendly;
    }

static {

        numberOfEyes = 2;
        numberOfLegs = 4;
        numberOfWings = 0;
}
        public void eat(){

            System.out.println(breed +"  type of dog is eating ");

}
        public void drink(){

            System.out.println(breed + " type of dog is drinking");

        }


    public void sleep(){

        System.out.println(breed + " type of dog is sleeping");

    }

    public void play(){

        System.out.println(breed + " type of dog is playing");

    }
    public void barking(){

        System.out.println(breed + " type of dog is barking");

    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", isFriendly=" + isFriendly +
                '}';
    }
}


/*
1. Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */