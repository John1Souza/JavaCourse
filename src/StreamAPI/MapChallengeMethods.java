package StreamAPI;


import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallengeMethods {

    private MapChallengeMethods(){

    }

    public final static UnaryOperator<Integer> value = v -> v;
    public static String returnBinaryString(int number){
        String binary = "";
        while (number != 0) {
            //System.out.print(" Number is " + number);
            binary += number % 2;
            number = number / 2;
        }
        return binary;
    }

    public static String returnQuotientInverted(String binary){
        String binaryReverse = "";
        for (int i = binary.length()-1; i >= 0; i--){
            binaryReverse += binary.charAt(i);
        }
        return binaryReverse;
    }

    public static int retrunToNumber(String binary){

        double sum = 0;
        for(int i = 0; i < binary.length(); i++){
            sum += (Character.getNumericValue(binary.charAt(i)) * Math.pow(2, i));
        }

        return (int)sum;
    }
}
