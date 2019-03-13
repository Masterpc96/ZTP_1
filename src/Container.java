// Polimorfizm ograniczeniowy
// Polimorfizm parametryczny
public class Container<T extends Vehicle> {


    private T type;

    public Container(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}