public class Main {
    public static void main (String args[]){
        Truck truck = new Truck("DAF");
        Vehicle vehicle = new Car("Bugatti");
        Vehicle vehicle1 = new Vehicle("Vehicle one");

        System.out.println(vehicle1.getVehicleName());
        System.out.println(truck.getVehicleName());
        System.out.println(vehicle.getVehicleName());

        truck.fillUp(500, 100);
        vehicle.fillUp(500);
    }
}
