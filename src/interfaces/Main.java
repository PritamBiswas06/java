package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        System.out.println(car.book);
//        car.start();
////        car.brake();
//        car.stop();
//
//        Brake brake = new Car();
//        brake.brake();
//
//        Media car1=new Car();
//        car1.start();
//
        NewCar car3 = new NewCar();
        car3.start();
        car3.stop();
        car3.startMedia();
        car3.stopMedia();
        car3.upgradeEngine();
        car3.start();
    }
}
