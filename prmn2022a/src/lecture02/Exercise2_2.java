package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        GasStation gas = new GasStation();
        gas.reful(car);
        car.run();
    }
}
