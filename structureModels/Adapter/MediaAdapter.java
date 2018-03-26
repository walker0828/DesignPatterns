public class MediaAdapter implements MediaPlayer{
    public AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String auditType){
        if(auditType.equalsIngnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();
        } else if (auditType.equalsIngnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String auditType,String fileName){
        if(auditType.equalsIngnoreCase("vlc")){
            advancedMusicPlayer.playVlc();
        }else if(auditType.equalsIngnoreCase("mp4")){
            advancedMusicPlayer.playMp4();
        }
    }

}