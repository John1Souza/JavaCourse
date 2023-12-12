package OO.Inheritance.Challenge;

public class Ferrari extends Car {
    int accelerate(){
       return currentSpeed += 15;
    }

    int brake(){
        return currentSpeed -= 15;
    }
}
