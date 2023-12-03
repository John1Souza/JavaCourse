package ClassesAndMethods;

public class CircleAreaTest {
    public static void main(String[] args) {
        CircleArea a1 = new CircleArea(10);
        // a1.pi = 10;
        System.out.println(a1.area());

        CircleArea a2 = new CircleArea(5);
        // a2.pi = 5;
        System.out.println(a2.area());
        System.out.println(CircleArea.PI);
        System.out.println(CircleArea.area(100));
    }
}
