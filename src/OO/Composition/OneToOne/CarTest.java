package OO.Composition.OneToOne;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.on();
        System.out.println(c1.isOn());

        System.out.println(c1.engine.spins());

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

        System.out.println(c1.engine.spins());

        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();


        // lack of encapsulation
        // c1.engine.injectionFactor = -30;

        System.out.println(c1.engine.spins());

        // two-dimensional relantions
        System.out.println(c1.engine.car.engine.car.engine.spins());



    }
}
