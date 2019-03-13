public class Bugatti extends Car {

    protected String bugattiModel;

    public Bugatti(String vehicleName) {
        super(vehicleName);
        this.bugattiModel = vehicleName;
    }

    public String getBugattiModel(){
        return "This is bugatti " + bugattiModel + " the fastest car all over the world";
    }

    @Override
    public String toString() {
        return "Bugatti";
    }
}
