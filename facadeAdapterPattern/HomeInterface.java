public class HomeInterface{
    private HomeService homeService;

    public HomeInterface(HomeService homeService){
        this.homeService = homeService;
    }

    public void turnOnAll(){
        homeService.turnOn();
    }
    public void turnOffAll(){
        homeService.turnOff();
    }
}