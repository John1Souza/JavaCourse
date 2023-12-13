package OO.Inheritance.Challenge02.Challenge;

public class Car {
    int currentSpeed = 50;
    final int MAX_SPEED;
    private int delta = 5;


    Car(int maxSpeed){
        MAX_SPEED = maxSpeed;
    }
    int accelerate(){
        if(currentSpeed + getDelta() > MAX_SPEED){
            return currentSpeed = MAX_SPEED;
        }else {
            currentSpeed += getDelta();
        }
        return 0;
    }

    int brake(){
        if(currentSpeed > 4){
            return currentSpeed -= 5;
        }else{
            return 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
