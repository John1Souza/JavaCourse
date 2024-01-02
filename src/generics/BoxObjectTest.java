package generics;

import javax.swing.*;

public class BoxObjectTest {
    public static void main(String[] args) {
        BoxObject boxA = new BoxObject();
        boxA.save(2.3); // double -> Double

        Double thing = (Double) boxA.open();
        System.out.println(thing);

        BoxObject boxB = new BoxObject();
        boxB.save("Hello"); // double -> Double

        String thingB = (String) boxB.open();
        System.out.println(thingB);
    }
}
