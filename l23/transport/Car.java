package MyNewHomeworkUsingGit.l23.transport;

public class Car extends Transport {
    String ownerFamilyName;
    int howBigIsOwnerFamily;

    public Car(String manufacturer, String condition, String ownerFamilyName, int howBigIsOwnerFamily) {
        super(manufacturer, condition);
        this.ownerFamilyName = ownerFamilyName;
        this.howBigIsOwnerFamily = howBigIsOwnerFamily;
    }

    public String toString() {
        return "Car. Model is " + this.manufacturer + ". Is in " + this.condition + " condition." +
                " Car belongs to " + this.ownerFamilyName + " family. There is " +
                this.howBigIsOwnerFamily + " people in the family";
    }
    protected void specialThingsItCanDo(){
        super.specialThingsItCanDo();
        System.out.println("Honks really loud.");
    }
}