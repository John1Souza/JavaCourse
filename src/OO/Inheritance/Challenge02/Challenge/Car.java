package OO.Inheritance.Challenge02.Challenge;

public class Car {
    int currentSpeed = 50;
    final int MAX_SPEED;
    int delta = 5;


    Car(int maxSpeed){
        MAX_SPEED = maxSpeed;
    }
    int accelerate(){
        if(currentSpeed + delta > MAX_SPEED){
            return currentSpeed = MAX_SPEED;
        }else {
            currentSpeed += delta;
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
}
