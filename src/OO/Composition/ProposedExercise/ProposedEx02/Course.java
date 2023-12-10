package OO.Composition.ProposedExercise.ProposedEx02;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    List<Student> studentsList = new ArrayList<>();
    Student student;

    Course(String name){
        this.name = name;
    }
    void addStudent(Student student){
        studentsList.add(student);
    }
}
