package Lambdas;

public class CalculationTest2 {
    public static void main(String[] args) {
        Calculation calc = (x, y) -> {return x * y;};


        System.out.println(calc.execute(2,4));

        calc = (x, y) -> x + y;
        System.out.println(calc.execute(2, 4));

        System.out.println(calc.cool());
        System.out.println(Calculation.veryCool());
    }
}
