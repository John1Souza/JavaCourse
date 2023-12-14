package Lambdas;

public class CalculationTest {
    public static void main(String[] args) {
        Calculation calc = new Sum();
        Calculation calc1 = new Multiplication();

        Calculation calc01 = (x, y) -> {return x * y;};
        Calculation calc02 = (x, y) -> x + y;

        System.out.println(calc.execute(2, 3));
        System.out.println(calc1.execute(2, 3));
        System.out.println(calc01.execute(2,3));
        System.out.println(calc02.execute(2,3));
    }
}
