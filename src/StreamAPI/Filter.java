package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.8);
        Student s2 = new Student("Bia", 5.8);
        Student s3 = new Student("Daniel", 9.8);
        Student s4 = new Student("Gui", 6.8);
        Student s5 = new Student("Rebeca", 7.1);
        Student s6 = new Student("Pedro", 8.8);

        List<Student> studentsList = Arrays.asList(s1,s2,s3,s4,s5,s6);

        Predicate<Student> approved = a -> a.grade >= 7;
        Function<Student, String> congratsApproved =
                a -> "Congratulations " + a.name + "! You're approved!!!";

        studentsList.stream()
                .filter(approved)
                .map(congratsApproved)
                .forEach(System.out::println);
    }
}
