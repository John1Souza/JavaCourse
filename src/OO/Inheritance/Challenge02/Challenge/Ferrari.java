package OO.Inheritance.Challenge02.Challenge;

public class Ferrari extends Car  implements Sporty, Lux{

    private boolean onTurbo;
    private boolean onAir;
    Ferrari(int maxSpeed){
        super(maxSpeed);
        setDelta(255);
    }
    @Override
    public void onTurbo() {
        setDelta(35);
        onTurbo = true;
    }

    @Override
    public void offTurbo() {
        setDelta(15);
        onTurbo = false;
    }

    @Override
    public void onAirConditioner(){
        onAir = true;
    };

    @Override
    public void offAirConditioner(){
        onAir = false;
    };

    @Override
    public int getDelta() {
        if(onTurbo && !onAir){
            return 35;
        } else if(onTurbo && onAir){
            return 30;
        } else if(!onTurbo && !onAir){
            return 20;
        }else{
            return 15;
        }
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
