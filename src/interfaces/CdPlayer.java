package interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("I start media player");
    }

    @Override
    public void stop() {
        System.out.println("I stop media player");
    }
}
