package OO.Inheritance.Challenge03.Test;

import OO.Inheritance.Challenge03.Challenge.Car;
import OO.Inheritance.Challenge03.Challenge.Civic;
import OO.Inheritance.Challenge03.Challenge.Ferrari;

public class CarTest {
    public static void main(String[] args) {

        //Civic civic_g9 = new Civic();
        Civic civic_g9 = new Civic();
        civic_g9.accelerate();

        System.out.println(civic_g9);

        civic_g9.brake();
        System.out.println(civic_g9);

        //Ferrari laFerrari = new Ferrari();
        Car laFerrari = new Ferrari(350);

        System.out.println(laFerrari);

    }


}
