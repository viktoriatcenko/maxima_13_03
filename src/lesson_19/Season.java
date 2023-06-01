package lesson_19;

public enum Season {
    WINTER(1, "����"), SPRING(2, "�����"),
    SUMMER(3, "����"), AUTUMN(4, "�����");

    private int numberOfSeason;
    private String russianName;

    Season(int numberOfSeason, String russianName) {
        this.numberOfSeason = numberOfSeason;
        this.russianName = russianName;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public String getRussianName() {
        return russianName;
    }
}
