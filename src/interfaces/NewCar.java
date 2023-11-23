package interfaces;

public class NewCar {
    private Engine engine;
    private Media media = new CdPlayer();

    public NewCar() {
        engine=new PowerEngine();
    }


    public NewCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
    public void startMedia(){
        media.start();
    }

    public void stopMedia(){
        media.stop();
    }

    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
}
