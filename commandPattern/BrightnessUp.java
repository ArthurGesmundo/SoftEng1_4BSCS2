package commandPattern;

public class BrightnessUp implements Command {
    
    private Lights lights;
    public BrightnessUp(Lights lights){
        this.lights = lights;
    }
    @Override
    public String execute() {
        return lights.BrightnessUp();
    }
}
