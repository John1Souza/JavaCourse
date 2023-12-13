package OO.Inheritance.Challenge;

public class Car{
    int currentSpeed = 50;

    int accelerate(){
        if(currentSpeed <250){
            return currentSpeed += 5;
        }
        return 0;
    }

    int brake(){
        if(currentSpeed > 4){
            return currentSpeed -= 5;
        }
        return 0;
    }
}
