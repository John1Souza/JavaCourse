package OO.Composition.ProposedExercise.ProposedEx02;

import java.util.ArrayList;
import java.util.List;

public class School {
    String name;
    List<Course> courseList = new ArrayList<>();

    School(String name){
        this.name = name;
    }
    void addCourse(Course course){
        courseList.add(course);
    }
}
