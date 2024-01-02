package generics;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> boxA = new Box<>();
        boxA.save("Secret!");

        System.out.println(boxA.open());

        Box<Double> boxB = new Box<>();
        boxB.save(3.141516);

        System.out.println(boxB.open());
    }
}
