package fundamentals;

public class CircleArea {
    public static void main(String[] args) {
        double ray = 3.4;

        // Transform variable into constant variable, add "final" before variable type
        final double pi = 3.14159;

        double area = pi * ray * ray;

        System.out.println(area);
    }
}
