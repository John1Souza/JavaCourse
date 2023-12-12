package OO.Inheritance.Challenge02.Challenge;

public class Ferrari extends Car {

    Ferrari(int maxSpeed){
        super(maxSpeed);
        delta = 255;
    }

    Ferrari(){
        this(315);
    }
//    int accelerate(){
//
//        return currentSpeed += 15;
//    }
//
//    int brake(){
//        return currentSpeed -= 15;
//    }
}
