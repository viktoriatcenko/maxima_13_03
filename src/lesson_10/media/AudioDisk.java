package lesson_10.media;

public class AudioDisk extends Disk {
    // - музыкальных альбомах (название альбома, исполнитель, год издания, количество треков)
    private String singer;
    private int countOfTracks;

    public AudioDisk() {
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCountOfTracks() {
        return countOfTracks;
    }

    public void setCountOfTracks(int countOfTracks) {
        this.countOfTracks = countOfTracks;
    }
}
