package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Others {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.8);
        Student s2 = new Student("Bia", 5.8);
        Student s3 = new Student("Daniel", 9.8);
        Student s4 = new Student("Gui", 6.8);
        Student s5 = new Student("Rebeca", 7.1);
        Student s6 = new Student("Pedro", 8.8);
        Student s7 = new Student("Pedro", 8.8);
        Student s8 = new Student("Gui", 6.8);

        List<Student> studentsList = Arrays.asList(s1,s2,s3,s4,s5,s6, s7, s8);

        System.out.println("Distinct...");

        studentsList.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        studentsList.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile");
        studentsList.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.grade >= 7)
                .forEach(System.out::println);
    }
}
