package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        RemoteControl rc = new RemoteControl();
        MusicPlayer musicPlayer = new MusicPlayer();
        Lights lights = new Lights();
        Thermostat thermos = new Thermostat();

        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        VolumeUp volumeUp = new VolumeUp(musicPlayer);
        System.out.println(volumeUp.execute());

        VolumeDown volumeDown = new VolumeDown(musicPlayer);
        System.out.println(volumeDown.execute());

        BrightnessDown brightnessDown = new BrightnessDown(lights);
        System.out.println(brightnessDown.execute());

        BrightnessUp brightnessUp = new BrightnessUp(lights);
        System.out.println(brightnessUp.execute());

        TempDown tempDown = new TempDown(thermos);
        System.out.println(tempDown.execute());

        TempUp tempUp = new TempUp(thermos);
        System.out.println(tempUp.execute());
    }
}
