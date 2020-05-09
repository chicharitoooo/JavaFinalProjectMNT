import sun.audio.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Music{
    static void Music(String filename){
        AudioPlayer MAP = AudioPlayer.player;
        AudioStream MAS;

        ContinuousAudioDataStream loop = null;
        try {
            InputStream test = new FileInputStream(filename);
            MAS = new AudioStream(test);
            AudioPlayer.player.start(MAS);


        } catch (IOException error) {
        }
        MAP.start(loop);

    }

}
