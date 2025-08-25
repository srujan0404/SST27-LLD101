public class ElectricCar implements MotorType, RechargeType {
    @Override
    public void startEngine() {
        System.out.println("Electric motor started");
    }
    
    @Override
    public void recharge(int kWh) {
        System.out.println("Recharged with " + kWh + " kWh");
    }
}
