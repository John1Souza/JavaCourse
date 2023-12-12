package OO.Inheritance.Challenge03.Challenge;

public class Car {
    protected int currentSpeed = 50;
    public final int MAX_SPEED;
    protected int delta = 5;


    protected Car(int maxSpeed){
        MAX_SPEED = maxSpeed;
    }
    public void accelerate(){
        if(currentSpeed + delta > MAX_SPEED){
            currentSpeed = MAX_SPEED;
        }else {
            currentSpeed += delta;
        }
    }

    public void brake(){
        if(currentSpeed > 4){
           currentSpeed -= 5;
        }else{
            currentSpeed = 0;
        }
    }

    public String toString(){
        return "the current speed is " + currentSpeed;
    }
}
