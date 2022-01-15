package day39.Animal2;

    public class Tiger extends  WildAnimal{

        public Tiger(String name, String breed, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
            super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
        }


        public void hunt(){
            System.out.println(getName() +" ," +getBreed()+" is  hunting bu jumping");
        }




    }



