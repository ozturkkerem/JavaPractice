package day32;

public class Horse {

    public String name ;
    public String type;
    public char gender;
    public int age;


    public Horse (String name){

        this.name = name;
    }

    public Horse (String name, String type){

        this(name);

        this.type = type;
    }

    public Horse (String name, String type,char gender){

        this(name,type);

        this.gender = gender;


    }

    public Horse (String name, String type,char gender, int age){

        this(name,type,gender);

        this.age = age;

    }

    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
