public class Client {
    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet laptopPowerOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPowerOutlet = new RefrigeratorAdapter(refrigerator);

        SmartPhoneCharger smartPhoneCharger = new SmartPhoneCharger();
        PowerOutlet smartPhoneChargerPowerOutlet = new SmartPhoneChargerAdapter(smartPhoneCharger);
        
        System.out.println(laptopPowerOutlet.plugIn());
        System.out.println(refrigeratorPowerOutlet.plugIn());
        System.out.println(smartPhoneChargerPowerOutlet.plugIn());

    }
}
