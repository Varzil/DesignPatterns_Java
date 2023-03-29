package AdapterDesignPattern;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "rickroll.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "himym.vlc");
        audioPlayer.play("avi", "hello.avi");
    }
}