package lesson_14;

public class Coin implements Comparable<Coin>{
    // Fields
    private int nominal;
    private double diameter;
    private String country;
    private int year;

    // Constructor


    public Coin(int nominal, double diameter, String country, int year) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.country = country;
        this.year = year;
    }

    // Methods


    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // Coin coin1 = new Coin(10, 20.2, "Russia", 2007);
    // Coin coin2 = new Coin(10, 20.1, "Russia", 2007);


    // this         o
    // coin1.equals(coin2);
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diameter, diameter) != 0) return false;
        if (year != coin.year) return false;
        return country.equals(coin.country);
    }





    // Coin coin1 = new Coin(10, 20.2, "Russia", 2007);
    // Coin coin1 = new Coin(20.2, 10, "Russia", 2007);

    // Coin coin2 = new Coin(15, 20.7, "Belarus", 2001); // 21356564
    @Override
    public int hashCode() {
        int result; // 0
        long temp; // 0
        result = nominal; // result = 10
        temp = Double.doubleToLongBits(diameter); // 14521
        result = 31 * result + (int) (temp ^ (temp >>> 32)); // 10 * 31 + 2135456 = 216545661
        result = 31 * result + country.hashCode(); // 216545661 = 216545661 * 31 + 212165421 = 4651236549812
        result = 31 * result + year; // 4651236549812 * 31 + 2007 = 21654621545612
        return result; // 21654621545612
    }


    @Override
    public int compareTo(Coin o) {
        if (this.getYear() != o.getYear()) {
            return this.getYear() - o.getYear();
        }
        if (this.getNominal() != o.getNominal()) {
            return this.getNominal() - o.getNominal();
        }
        if (this.getDiameter() != o.getDiameter()) {
            return Double.compare(this.getDiameter(), o.getDiameter());
        }
        return this.getCountry().compareTo(o.getCountry());
    }
}
