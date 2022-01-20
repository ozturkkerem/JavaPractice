package day40.studentTask;

public class GraduateStudent extends Student {


    public GraduateStudent(String name, char gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }


    @Override
    public void study() {
        System.out.println(getStudentId()+" "+ getName() + " is studying to be have .....");
    }
}
