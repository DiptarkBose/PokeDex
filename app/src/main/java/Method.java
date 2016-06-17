import android.content.Context;
import android.media.MediaPlayer;

public class Method {
    MediaPlayer player;

    private static Method refrence = null;

    public static Method getInstance(){
        if(refrence == null){
            refrence = new Method();
        }
        return refrence;
    }
    public void initializeMediaPlayer(Context context, int musicId){

// add initalization of media player in it and loop it

        player=MediaPlayer.create(context,musicId);
    }

    public void startPlaying(){
// add code to start playing music
        player.start();
    }

    public void stopPlaying(){
// add code to stop playing music
        player.stop();
    }

}