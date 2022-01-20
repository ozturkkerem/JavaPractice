package day40.studentTask;

public class UndergraduateStudent extends Student{


    public UndergraduateStudent(String name, char gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }

public void study(){

    System.out.println(getStudentId()+ " " + getName() +" is studying for graduate");

}


}
