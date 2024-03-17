package MyNewHomeworkUsingGit.consultations.cons11.example1;

public class Cup implements Comparable<Cup> {
    private double volume;
    private String color;
    private double price;

    public Cup(double volume, String color, int price
    ) {
        this.volume = volume;
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public int compareTo(Cup o) {
        if (this.volume < o.volume) {
            return -1;
        } else if (this.volume > o.volume) {
            return 1;
        }
        return 0;
    }
}
