package MyNewHomeworkUsingGit.l42;

import java.util.stream.Stream;

public class Main04 {
    public static void main(String[] args) {
        String[] strings = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };

        boolean result = Stream.of(strings)
                .peek(s -> System.out.println(s))
                .allMatch(s -> s.length() > 3);
        System.out.println(result);
    }
}
