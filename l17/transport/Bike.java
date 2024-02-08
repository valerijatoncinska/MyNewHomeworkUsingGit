package MyNewHomeworkUsingGit.l17.transport;

public class Bike {
    String manufacturer;
    int age;

    public Bike (String name, int age) {
        this.manufacturer = name;
        this.age = age;
    }

    public String toString() {
        return "Bike, " + this.manufacturer + ", " + age;
    }
}