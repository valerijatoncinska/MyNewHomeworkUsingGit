package MyNewHomeworkUsingGit.l17.transport;

public class Car {
    String manufacturer;
    int age;

    public Car (String name, int age) {
        this.manufacturer = name;
        this.age = age;
    }

    public String toString() {
        return "Car, " + this.manufacturer + ", " + age;
    }
}