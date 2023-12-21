package Exception.personalizedB;
import Exception.Student;

public class TestValidation {
    public static void main(String[] args) {
        try {
            Student student = new Student("Ana", -7);
            Validate.student(student);
            Validate.student(null);
        } catch (EmptyStringException e) { //catch (EmptyStringException | NumberOutOfRangeException e)
            System.out.println(e.getMessage());
        } catch (NumberOutOfRangeException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("End :)");
    }
}
