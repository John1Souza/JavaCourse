package StreamAPI;


import java.util.Iterator;
import java.util.function.UnaryOperator;

public class MapChallengeMethods {

    private MapChallengeMethods(){

    }

    public final static UnaryOperator<Integer> value = v -> v;
    public static String returnQuotient(int number){
        String quotient = "";
        int numberBeforeConversion = number;
        while (number != 0) {
            //System.out.print(" Number is " + number);
            quotient += number % 2;
            number = number / 2;
        }
        return quotient;
    }

    public static String returnQuotientInverted(String quotient){
        return quotient.translateEscapes();
    }
}
