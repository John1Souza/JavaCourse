package OO.Composition.OneToOne;

public class Engine {

    Car car;
    boolean on = false;
    double injectionFactor = 1;

    Engine(Car car){
        this.car = car;
    }
    int spins(){
        if(!on){
            return 1;
        }else{
            return (int) Math.round(injectionFactor * 3000) ;
        }
    }
}
