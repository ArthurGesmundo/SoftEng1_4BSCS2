package commandPattern;

public class VolumeUp implements Command {
    
    private MusicPlayer musicPlayer;
    public volumeUp(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override
    public String execute() {
        return musicPlayer.volumeUp();
    }
}
