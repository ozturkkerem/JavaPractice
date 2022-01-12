package day34;

public class Student {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static boolean isHuman;


    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    static {
        schoolName = "cydeo";

        isHuman = true;

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", is Human=" + isHuman +
                '}';
    }
}
