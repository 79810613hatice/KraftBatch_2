package Day_41_Polymorphism;

public class Car implements IVehicle {
// "generate" - "implement method" yaparak metotları implement yaptık.
    @Override
    public void start() {
        System.out.println("car start");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }

    @Override
    public int durmaMesafesi() {
        return 20;
    }
}
