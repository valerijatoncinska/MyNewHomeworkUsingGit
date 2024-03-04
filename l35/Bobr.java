package MyNewHomeworkUsingGit.l35;
import java.util.Comparator;

public class Bobr implements Comparable<Bobr> {
    String name;
    int age, relativeCount;

    Bobr (String name, int age, int relativeCount) {
        this.name = name;
        this.age = age;
        this.relativeCount = relativeCount;
    }

    @Override
    public int compareTo(Bobr second) {
        return Integer.compare(this.age, second.age);
    }
    @Override
    public String toString() {
        return this.name + ", возраст: " + this.age + ". Число родственников: " + this.relativeCount;
    }
}
class NameComparator implements Comparator<Bobr> {
    @Override
    public int compare(Bobr first, Bobr second) {
        return first.name.compareToIgnoreCase(second.name);
    }
}

class RelativeCountComparator implements Comparator<Bobr> {
    @Override
    public int compare(Bobr first, Bobr second) {
        return Integer.compare(first.relativeCount, second.relativeCount);
    }
}


