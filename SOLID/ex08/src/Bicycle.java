public class Bicycle implements PedalType {
    @Override
    public void pedal(int effort) {
        System.out.println("Pedal effort " + effort);
    }
}