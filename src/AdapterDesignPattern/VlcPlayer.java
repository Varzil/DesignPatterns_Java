package AdapterDesignPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Cant play the Mp4 file");
    }
}