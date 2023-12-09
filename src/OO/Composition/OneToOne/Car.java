package OO.Composition.OneToOne;

public class Car {
    Engine engine;

    Car(){
        this.engine = new Engine(this);
    }
    void accelerate(){
        if(engine.injectionFactor < 2.6){
            engine.injectionFactor += 0.4;
        }
    }

    void brake(){
        if(engine.injectionFactor > 0.5){
            engine.injectionFactor -= 0.4;
        }
    }

    void on(){
        engine.on = true;
    }

    void off(){
        engine.on = false;
    }

    boolean isOn(){
        return engine.on;
    }

}
