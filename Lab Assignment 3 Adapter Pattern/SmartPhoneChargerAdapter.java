public class SmartPhoneChargerAdapter implements PowerOutlet{
    private SmartPhoneCharger smartPhoneCharger;

    public SmartPhoneChargerAdapter(SmartPhoneCharger smartPhoneCharger){
        this.smartPhoneCharger = smartPhoneCharger;
    }


    @Override
    public String plugIn() {
        return smartPhoneCharger.chargePhone();
    }
    
}