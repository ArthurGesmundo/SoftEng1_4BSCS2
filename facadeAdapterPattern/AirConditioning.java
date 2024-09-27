public class AirConditioning implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("AC on");
    }
    @Override
    public void turnOff(){
        System.out.println("AC off");
    }

}