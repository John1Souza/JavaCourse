package Challenges;

public class ChallengeForLoopWithoutNumericValue {
    public static void main(String[] args) {

        //String value = "#";
        //for(int i = 1; i <= 5; i++){
        //    System.out.println(value);
        //    value+="#";
        //}

        String value2 = "#";
        for(;!value2.equalsIgnoreCase("######");value2+="#"){
            System.out.println(value2);

        }
    }
}
