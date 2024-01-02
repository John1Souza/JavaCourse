package generics;

public class BoxIntTest{
    public static void main(String[] args) {
        Box<Integer> boxA = new Box<>();
        boxA.save(123);

        Integer thingA = boxA.open();
        System.out.println(thingA);
    }
}
