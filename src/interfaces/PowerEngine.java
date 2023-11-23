package interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start the Power engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Power engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the Power engine");

    }

}
