package OO.Composition.ManyToMany;

public class CourseTest {
    public static void main(String[] args) {
        Student student01 = new Student("John Doe");
        Student student02 = new Student("Maty Doe");
        Student student03 = new Student("Paul Doe");
        Student student04 = new Student("Ragnar Doe");

        Course course1 = new Course("Java Full");
        Course course2 = new Course("WEB Full");
        Course course3 = new Course("React Full");
        Course course4 = new Course("PHP Full");


        student01.addCourse(course1);
        course1.addStudent(student02);

        student03.addCourse(course2);
        course2.addStudent(student04);

        student01.addCourse(course3);
        course3.addStudent(student03);

        student02.addCourse(course4);
        course4.addStudent(student04);

        for(Student student: course1.students){
            System.out.println("I'm registered on course " + course3.name + " ...");
            System.out.println("...and my name is " + student.name);
            System.out.println();
        }

        System.out.println(student01.courses.get(0).students);

        Course findedCourse = student01.getCourseByName("Java Full");

        if(findedCourse != null ){
            System.out.println(findedCourse.name);
            System.out.println(findedCourse.students);
        }

    }
}
