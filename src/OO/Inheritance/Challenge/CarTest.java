package OO.Inheritance.Challenge;

public class CarTest {
    public static void main(String[] args) {

        //Civic civic_g9 = new Civic();
        Car civic_g9 = new Civic();
        civic_g9.accelerate();

        System.out.println("the current speed of the Civic is " +
                civic_g9.currentSpeed + "Km/h");

        civic_g9.brake();
        System.out.println("the current speed of the Civic is " +
                civic_g9.brake() + "Km/h");


        //Ferrari laFerrari = new Ferrari();
        Car laFerrari = new Ferrari();


        System.out.println("the current speed of the La Ferrari is " +
                laFerrari.currentSpeed + "Km/h");

        laFerrari.brake();

        System.out.println("the current speed of the La Ferrari is " +
                laFerrari.currentSpeed + "Km/h");

    }


}
