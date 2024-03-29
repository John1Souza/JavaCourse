package StreamAPI;

import java.util.Objects;

public class Student {
    final String name;
    final double grade;
    final boolean goodBehavior;

    public Student(String name, double grade) {
        this(name, grade, true);
    }
    public Student(String name, double grade, boolean goodBehavior) {
        this.name = name;
        this.grade = grade;
        this.goodBehavior = goodBehavior;
    }

    public String toString(){
        return name + " have the grade " + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(grade, student.grade) == 0 && goodBehavior == student.goodBehavior && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, goodBehavior);
    }
}
