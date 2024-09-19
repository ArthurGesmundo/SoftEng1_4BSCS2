package commandPattern;

public class BrightnessDown implements Command {
    
    private Lights lights;
    public BrightnessDown(Lights lights){
        this.lights = lights;
    }
    @Override
    public String execute() {
        return lights.BrightnessDown();
    }
}
