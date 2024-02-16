package MyNewHomeworkUsingGit.l23.transport;

public class Bike extends Transport {
    String ownersName;

    public Bike(String manufacturer, String condition, String ownersName) {
        super(manufacturer, condition);
        this.ownersName = ownersName;
    }

    public String toString() {
        return "Bike. Model is " + this.manufacturer + ". Is in " + this.condition + " condition." +
                " Owner is  " + this.ownersName;
    }
    protected void specialThingsItCanDo(){
        super.specialThingsItCanDo();
        System.out.println("Drifts really good");
    }

}