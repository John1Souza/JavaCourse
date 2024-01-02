package Exception.personalizedB;
import Exception.Student;

public class Validate {
    private Validate(){}
    public static void student(Student student)
            throws NumberOutOfRangeException, EmptyStringException{
        if(student == null){
            throw new IllegalArgumentException("Student is null");
        }
        if(student.name == null || student.name.trim().isEmpty()){
            throw new EmptyStringException("name");

        }

        if(student.grade < 0 || student.grade > 10){
            throw new NumberOutOfRangeException("grade");
        }
    }
}
