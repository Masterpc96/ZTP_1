public class Vehicle {

    protected String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName(){
        return "This is " + vehicleName + " general type vehicle";
    }

    public void fillUp(int fuelLitres){
        System.out.println("Vehicle filled up with " + fuelLitres + " fuel");
    }

    @Override
    public String toString() {
        return "Vehicle";
    }
}
