package day34;

import javax.crypto.spec.PSource;

public class CydeoStudent {

    public String name;
    public char Gender;
    public int age, batchNumber,groupNumber;


    public static String schoolName;
    public static String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        Gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {

        schoolName = "Cydeo";
        fieldOfStudy = "Java";
        programmingLanguage = "Python";
        secretCode = "Wooden Spoon";
    }

    public void printSchoolName(){
        System.out.println(schoolName);
    }

    public void printSecretCode(){
        System.out.println(secretCode);
    }

    public void attendClass(){

        System.out.println(fieldOfStudy);
    }


}

/*
   2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy,
                 programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()




 */