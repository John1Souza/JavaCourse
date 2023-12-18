package StreamAPI;

import java.util.function.UnaryOperator;

public class Utilitaries {

    private Utilitaries(){

    }
    public final static UnaryOperator<String> upperCase = n -> n.toUpperCase();
    public final static UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
    public final static String shout(String n){
        return n + "!!! ";
    };
}
