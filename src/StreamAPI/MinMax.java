package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.8);
        Student s2 = new Student("Bia", 5.8);
        Student s3 = new Student("Daniel", 9.8);
        Student s4 = new Student("Gui", 6.8);
        Student s5 = new Student("Rebeca", 7.1);
        Student s6 = new Student("Pedro", 8.8);

        List<Student> studentsList = Arrays.asList(s1,s2,s3,s4,s5,s6);

        Comparator<Student> bestGrade = (a1, a2) -> {
            if(a1.grade > a2.grade) return 1;
            if (a1.grade < a2.grade) return -1;
            return 0;
        };

        Comparator<Student> worstGrade = (a1, a2) -> {
            if(a1.grade > a2.grade) return -1;
            if (a1.grade < a2.grade) return 1;
            return 0;
        };

        System.out.println(studentsList.stream().max(bestGrade).get());
        System.out.println(studentsList.stream().max(worstGrade).get());

        System.out.println(studentsList.stream().min(bestGrade).get());
        System.out.println(studentsList.stream().min(worstGrade).get());

    }

}
