package MyNewHomeworkUsingGit.l17.animal;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Cat, " + this.name + ", " + age;
    }
}