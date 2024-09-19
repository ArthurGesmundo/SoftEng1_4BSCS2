package commandPattern;

public class TempDown implements Command {
    
    private Thermostat thermos;
    public tempDown(Thermostat thermos){
        this.thermos = thermos;
    }
    @Override
    public String execute() {
        return thermos.tempDown();
    }
}
