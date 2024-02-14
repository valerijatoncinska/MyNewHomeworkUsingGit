package MyNewHomeworkUsingGit.l17.transport;

public class Bus extends Transport {
    String usedForWhat;
    int seatCount;

    public Bus(String manufacturer, String condition, String usedForWhat, int seatCount) {
        super(manufacturer, condition);
        this.usedForWhat = usedForWhat;
        this.seatCount = seatCount;
    }

    public String toString() {
        return "Bus. Model is " + this.manufacturer + ". Is in " + this.condition + " condition." +
                " Seat count is " + this.seatCount + ". Used for " + this.usedForWhat;
    }
}