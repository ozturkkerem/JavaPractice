package day40.studentTask;

public class Student extends Person{


    private int studentId;
    private String fieldOfStudy;
    private String schoolName;
    private char grade;

    public Student(String name, char gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade =='A' ||  grade == 'B' || grade == 'C' ||  grade == 'D' || grade == 'F'))
        {
            System.out.println(grade + " Wrong grade. The grade must be between A to E");
            System.exit(1);

        }


        this.grade = grade;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null && fieldOfStudy.isEmpty() && fieldOfStudy.isBlank())
        {
            System.out.println( fieldOfStudy +"Field of study can not be empty! Please write it again");
            System.exit(1);

        }

        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null && schoolName.isEmpty() && schoolName.isBlank())
        {
            System.out.println( fieldOfStudy +"Field of study can not be empty! Please write it again");
            System.exit(1);

        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" " + studentId+" is studying" );

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName()  + '\'' +
                ", gender=" + getGender()  +
                ", age=" + getAge()  +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}

/*
2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included



	3. Create the following sub classes of Student class:

				1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary

				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

				3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


				4. Create a class named StudentObjects:

						Create the objects of each sub classes

						test all the functions of each objects

            			Analyze the relationships between the classes


 */
