package lecture02;

public class GasStation {
    void reful(Car car){
        car.fuel += 20;
        System.out.println("給油したことによりfuelが" + car.fuel + "増えました。");
    }
}
