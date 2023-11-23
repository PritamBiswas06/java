package interfaces;

public class Car implements Engine,Brake,Media {

    int book =70;


    @Override
    public void brake() {
        System.out.println("I'm brake");
    }

    @Override
    public void start() {
        System.out.println("I'm start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I'm stop");
    }

    @Override
    public void acc() {
        System.out.println("I'm acc");
    }
}
