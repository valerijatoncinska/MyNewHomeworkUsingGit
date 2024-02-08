package MyNewHomeworkUsingGit.l17.transport;

public class Bus {
    String manufacturer;
    int age;

    public Bus (String name, int age) {
        this.manufacturer = name;
        this.age = age;
    }

    public String toString() {
        return "Bus, " + this.manufacturer + ", " + age;
    }
}