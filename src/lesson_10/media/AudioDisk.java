package lesson_10.media;

public class AudioDisk extends Disk {
    // - ����������� �������� (�������� �������, �����������, ��� �������, ���������� ������)
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
