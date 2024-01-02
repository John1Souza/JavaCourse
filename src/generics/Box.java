package generics;

public class Box<T> { // Definir o tipo pode ser apenas com uma letra, SEMPRE MAIUSCULAS
    private T thing;

    public void save(T thing) {
        this.thing = thing;
    }

    public T open() {
        return thing;
    }
}
