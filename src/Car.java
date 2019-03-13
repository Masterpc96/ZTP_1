public class Car extends Vehicle{

    protected String carName;
    public Car(String vehicleName) {
        super(vehicleName + " type Car");
        carName = vehicleName;
    }

    // Polimorfizm inkluzyjny przesłanianie metod które są odziedziczone
    public String getCarName() {
        return "This is car " + carName;
    }

    @Override
    public String toString() {
        return "Car";
    }
}
