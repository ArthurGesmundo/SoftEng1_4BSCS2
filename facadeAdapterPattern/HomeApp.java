public class HomeApp {
    public static void main(String[] args){


        HomeService Lserv = new Light();
        HomeService Tserv = new TV();
        HomeService Aserv = new AirConditioning();

        HomeInterface Lfacade = new HomeInterface(Lserv);
        HomeInterface Tfacade = new HomeInterface(Tserv);
        HomeInterface Afacade = new HomeInterface(Aserv);


        
        Lfacade.turnOnAll();
        Afacade.turnOnAll();
        Tfacade.turnOnAll();
        Lfacade.turnOffAll();
        Tfacade.turnOffAll();
        Afacade.turnOffAll();
    }
}