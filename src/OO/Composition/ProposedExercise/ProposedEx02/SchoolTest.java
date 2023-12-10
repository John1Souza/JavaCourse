package OO.Composition.ProposedExercise.ProposedEx02;

public class SchoolTest {
    public static void main(String[] args) {
        Student studentOne = new Student("John Doe", 5.67, 1);
        Student studentTwo = new Student("Mary Doe", 4.67, 2);
        Student studentThree = new Student("Paul Doe", 7.67, 3);
        Student studentFour = new Student("Robert Doe", 2.67, 4);
        Student studentFive = new Student("Jose Mary Doe", 8.67, 5);


        Course course01 = new Course("ADS");
        Course course02 = new Course("Eng Soft");
        Course course03 = new Course("Cien Compt");

        course01.addStudent(studentOne);
        course02.addStudent(studentThree);
        course02.addStudent(studentTwo);
        course03.addStudent(studentThree);
        course03.addStudent(studentFour);
        course01.addStudent(studentFive);

        School school01 = new School("UniCesumar");

        school01.addCourse(course01);
        school01.addCourse(course02);
        school01.addCourse(course03);

        for(Course course: school01.courseList){
            System.out.println("<=================================================>");

            System.out.println("The course " + course.name
                    + " have "
                    + course.studentsList.size() + " students.");
            System.out.println("<--------------------------------->");
            for (Student student: course.studentsList){
                System.out.println("They are the students " +
                        student.id + " ==> " + student.name
                        + " Their final notes are: " + student.grade);
            }
            //System.out.println("<=================================================>");
        }


    }
}
