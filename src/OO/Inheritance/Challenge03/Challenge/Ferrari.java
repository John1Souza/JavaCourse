package OO.Inheritance.Challenge03.Challenge;

public class Ferrari extends Car {

    public Ferrari(int maxSpeed){
        super(maxSpeed);
        delta = 255;
    }

    public Ferrari(){
        this(315);
    }
//    public int accelerate(){
//
//        return currentSpeed += 15;
//    }
//
//    int brake(){
//        return currentSpeed -= 15;
//    }
//    public String toString(){
//        return "";
//    }
}
