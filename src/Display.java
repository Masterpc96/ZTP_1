public class Display {

    public static void main(String args[]) {

        Container<Vehicle> vehicleContainer = new Container<>(new Vehicle("Vehicle one"));
        Container<Car> carContainer = new Container<>(new Car("Car is extended by Vehicle"));
        Container<Bugatti> bugattiContainer = new Container<>(new Bugatti("Buggatti is extended by Car"));

        showVehicle(vehicleContainer);
        showCar(carContainer);
        showBugatti(bugattiContainer);



    }

    public static void showVehicle(Container<Vehicle> containerVehicle) {
        try {
            System.out.println(containerVehicle.getType().getVehicleName());
        } catch (Exception e) {
            System.out.println("There is no function such as getVehicleName in " + containerVehicle.getType());
        }

        try {
            System.out.println(((Car) containerVehicle.getType()).getCarName());
        } catch (Exception e) {
            System.out.println("There is no function such as getCarName in " + containerVehicle.getType());
        }

        try {
            System.out.println(((Bugatti) containerVehicle.getType()).getBugattiModel());
        } catch (Exception e) {
            System.out.println("There is no function such as getBugattiModel in " + containerVehicle.getType());
        }
        System.out.println("\n");
    }


    public static void showCar(Container<Car> containerVehicleCar) {
        try {
            System.out.println(((Vehicle)containerVehicleCar.getType()).getVehicleName());
        } catch (Exception e) {
            System.out.println("There is no function such as getVehicleName in " + containerVehicleCar.getType());
        }

        try {
            System.out.println(containerVehicleCar.getType().getCarName());
        } catch (Exception e) {
            System.out.println("There is no function such as getCarName in " + containerVehicleCar.getType());
        }

        try {
            System.out.println(((Bugatti) containerVehicleCar.getType()).getBugattiModel());
        } catch (Exception e) {
            System.out.println("There is no function such as getBugattiModel in " + containerVehicleCar.getType());
        }
        System.out.println("\n");
    }

    public static void showBugatti(Container<Bugatti> containerVehicleTesla) {
        try {
            System.out.println(containerVehicleTesla.getType().getVehicleName());
        } catch (Exception e) {
            System.out.println("There is no function such as getBugattiModel in " + containerVehicleTesla.getType());
        }

        try {
            System.out.println(((Car) containerVehicleTesla.getType()).getCarName());
        } catch (Exception e) {
            System.out.println("There is no function such as getBugattiModel in " + containerVehicleTesla.getType());
        }

        try {
            System.out.println(containerVehicleTesla.getType().getBugattiModel());
        } catch (Exception e) {
            System.out.println("There is no function such as getBugattiModel in " + containerVehicleTesla.getType());
        }
        System.out.println("\n");
    }


}
