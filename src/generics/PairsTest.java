package generics;

public class PairsTest {
    public static void main(String[] args) {
        Pairs<Integer, String> contestResult = new Pairs<>();

        contestResult.toAdd(1 , "Mary");
        contestResult.toAdd(2 , "Peter");
        contestResult.toAdd(3 , "Gui");
        contestResult.toAdd(4 , "Ana");
        contestResult.toAdd(5 , "Rebecca");
        contestResult.toAdd(2 , "John");

        System.out.println(contestResult.getValue(2));
    }
}
