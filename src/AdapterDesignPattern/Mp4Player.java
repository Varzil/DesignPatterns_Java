package AdapterDesignPattern;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Cant play the VLC file");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 Name: "+ fileName);
    }
}