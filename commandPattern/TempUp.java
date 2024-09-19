package commandPattern;

public class TempUp implements Command {
    
    private Thermostat thermos;
    public tempUp(Thermostat thermos){
        this.thermos = thermos;
    }
    @Override
    public String execute() {
        return thermos.tempUp();
    }
}
