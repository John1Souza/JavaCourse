package Exception;

public class Basics {
    public static void main(String[] args) {

        Student a1 = null;

        try{
            printStudentName(a1);
        }catch (Exception exception){
            System.out.println("An error ocurred when trying to print the student name");
        }

        try {
            System.out.println(7/0);
        }catch (ArithmeticException e){
            System.out.println("An error ocurred: " + e.getMessage());
        }
    }

    public  static void printStudentName(Student student){
        System.out.println(student.name);
    }
}
