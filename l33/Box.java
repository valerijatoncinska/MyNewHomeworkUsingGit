package MyNewHomeworkUsingGit.l33;

import java.util.stream.StreamSupport;

public class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public boolean isValueEqual(Object value) {

        return true;
    }

    public static <T> boolean isEquals(Box<T> box1, Box<T> box2) {

        return box1.get().equals(box2.get());
    }


    public static <T> String getAsString(Box<T> differentStringBox) {
        return differentStringBox.get().toString();
    }

    public static <T> T getValue(Object obj) {
        return (T) obj;
    }

}

class Main22 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.set("hello Generics!");
        System.out.println(stringBox.get());

        Box<Integer> box1 = new Box<Integer>();
        box1.set(455);
        System.out.println(box1.get());

        Box<Integer> box2 = new Box<Integer>();
        box2.set(233);
        System.out.println(box2.get());

        Box<Integer> box3 = new Box<Integer>();
        box3.set(233);
        System.out.println(box3.get());

        System.out.println("Значения коробки 1 (" + box1.get() + ") и значение коробки 2 (" +
                box2.get() + ") равно? Ответ: " + Box.isEquals(box1, box2) + "\n");

        System.out.println("Значения коробки 3 (" + box3.get() + ") и значение коробки 2 (" +
                box3.get() + ") равно? Ответ: " + Box.isEquals(box3, box2) + "\n");

        String box1AsString = Box.<Integer>getAsString(box1);
        String box2AsString = Box.<Integer>getAsString(box2);
        String box3AsString = Box.<Integer>getAsString(box3);

        String stringNotInABox = "  Random Numbers Go Here";
        Object boxedString = stringNotInABox;
        stringNotInABox = Box.<String>getValue(boxedString);

        System.out.println(box1AsString + box2AsString + box3AsString + stringNotInABox);

    }
}
