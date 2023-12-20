package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Luna", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Gabi", 10.0);

        List<Student> studentList = Arrays.asList(s1,s2,s3,s4);

        Predicate<Student> approved = a -> a.grade >= 7;
        Function<Student, Double> onlyGrade = a -> a.grade;

        BiFunction<Mean01, Double, Mean01> calculateMean =
                (mean, grade) -> mean.toAdd(grade);

        BinaryOperator<Mean01> combineMean =
                (m1, m2) -> Mean01.toCombine(m1, m2);

        Mean01 mean = studentList.stream()
                .filter(approved)
                .map(onlyGrade)
                .reduce(new Mean01(), calculateMean, combineMean);

        System.out.println("The average of the party is "
                + mean.getValue());
    }
}
