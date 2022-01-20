package day40.studentTask;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Ali",'M',23,100,"Sdet","Cydeo",'A',25,12,"Java");
        CydeoStudent cydeoStudent1 = new CydeoStudent("Veli",'M',25,101,"Sdet","Cydeo",'B',25,12,"Java");
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("ayse",'F',32,103,"developer","Cydeo",'A');
        GraduateStudent graduateStudent = new GraduateStudent("Nermin",'F',23,106,"History","Cydeo",'A');



        cydeoStudent.drink();
        cydeoStudent1.sleep();
        undergraduateStudent.study();

        ArrayList <Student> list = new ArrayList<>();

        list.add(cydeoStudent);
        list.add(cydeoStudent1);
        list.add(undergraduateStudent);
        list.add(graduateStudent);


        for (Student student : list) {
            System.out.println(student.getGender()+" " + student.getName());

        }

    }
}




/*
		4. Create a class named StudentObjects:

						Create the objects of each sub classes

						test all the functions of each objects

            			Analyze the relationships between the classes
 */
