package commandPattern;

public class VolumeDown implements Command {
    
    private MusicPlayer musicPlayer;
    public volumeDown(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override
    public String execute() {
        return musicPlayer.volumeDown();
    }
}
