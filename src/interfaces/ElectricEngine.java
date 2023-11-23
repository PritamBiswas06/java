package interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("I start like a Electric engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a Electric engine");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a Electric engine");

    }
}
