public class FlyingBird extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("Eating grains!");
    }
    
    @Override
    public void fly() {
        System.out.println("Flap!");
    }
}
