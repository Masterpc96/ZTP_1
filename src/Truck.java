public class Truck extends Vehicle {

    protected String carName;
    public Truck(String vehicleName) {
        super(vehicleName + " type Truck");
        carName = vehicleName;
    }


    // Polimorfizm inkluzyjny przesłanianie metod które są odziedziczone
    @Override
    public String getVehicleName() {
        return super.getVehicleName() + ". This is truck " + carName;
    }

    // Polimorfizm ad hoc
    public void fillUp(int fuelLitres, int adBlueLitres){
        System.out.println("Truck filled up with " + fuelLitres + " fuel and " + adBlueLitres + " litres of adBlue");
    }

}
