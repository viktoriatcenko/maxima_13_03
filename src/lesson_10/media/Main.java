package lesson_10.media;

public class Main {
    public static void main(String[] args) {
        /*
* ¬ы работаете над программой-каталогом домашней медиа-библиотеки фильмов и музыкальных альбомов на DVD дисках (образах).
 * 1. –азобрать классы дл€ хранени€ информации о:
- музыкальных альбомах (название альбома, исполнитель, год издани€, количество треков)
 - фильмах (название, год выхода, студи€ издатель, режиссер, продолжительность в минутах)
 * 2. —оздать массив дисков с неоднородным составом (фильмы и музыкальные диски),
заполнить его несколькими элементами, вывести все элементы на экран.
* 3. Ќайти в массиве самый старый диск и вывести информацию о нем на экран.
        * **/

        AudioDisk audioDisk1 = new AudioDisk();
        AudioDisk audioDisk2 = new AudioDisk();
        AudioDisk audioDisk3 = new AudioDisk();

        audioDisk1.setName("White album");
        audioDisk1.setYear(1991);
        audioDisk1.setSinger("Kino");
        audioDisk1.setCountOfTracks(14);

        audioDisk2.setSinger("Kirpichi");
        audioDisk2.setName("Sila uma");
        audioDisk2.setYear(2001);
        audioDisk2.setCountOfTracks(15);

        audioDisk3.setSinger("Sektor Gaza");
        audioDisk3.setName("Kolhoznyi pank");
        audioDisk3.setYear(1992);
        audioDisk3.setCountOfTracks(17);

        VideoDisk videoDisk1 = new VideoDisk();
        VideoDisk videoDisk2 = new VideoDisk();
        VideoDisk videoDisk3 = new VideoDisk();

        videoDisk1.setName("Transphormers");
        videoDisk1.setCountOfMinutes(120);
        videoDisk1.setDirector("Michael Bay");
        videoDisk1.setYear(2007);
        videoDisk1.setProducer("Rodnyanskiy");

        videoDisk2.setName("Titanic");
        videoDisk2.setYear(1995);
        videoDisk2.setDirector("James Cameron");
        videoDisk2.setCountOfMinutes(114);
        videoDisk2.setProducer("Silvestre Stallone");

        videoDisk3.setName("50 colors of Gray");
        videoDisk3.setYear(2015);
        videoDisk3.setDirector("Sam Taylor-Johnson");
        videoDisk3.setProducer("Bondarchuk");
        videoDisk3.setCountOfMinutes(117);

        Disk [] boxOfDisks = new Disk[6];

        boxOfDisks [0] = audioDisk1;
        boxOfDisks [1] = audioDisk2;
        boxOfDisks [2] = audioDisk3;
        boxOfDisks [3] = videoDisk1;
        boxOfDisks [4] = videoDisk2;
        boxOfDisks [5] = videoDisk3;

        for (Disk diskFromBox : boxOfDisks) {
            System.out.println(diskFromBox.toString());
        }

        System.out.println("debug");



    }
}
