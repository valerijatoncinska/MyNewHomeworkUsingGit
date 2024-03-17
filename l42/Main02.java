package MyNewHomeworkUsingGit.l42;

import java.util.List;
import java.util.Objects;

class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main02 {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("Marsik"),
                new Cat("Barsik"),
                new Cat("Masik"),
                new Cat("Boris"),
                new Cat("Matroskin")
        );

        cats.stream()
                .forEach(cat -> System.out.println(cat.hashCode() + " | " + cat));

        System.out.println("-------------------------------------------------------------------------");

        cats.stream()
                .peek(cat -> System.out.println(cat.hashCode() + " | " + cat))
                .forEach(cat -> System.out.println(cats));
    }

}
