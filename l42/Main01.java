package MyNewHomeworkUsingGit.l42;

import java.util.stream.Stream;

public class Main01 {
    public static void main(String[] args) {

        String[] strings = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };

        long lemonCount = Stream
                .of(strings)
                .filter(s -> s.equals("lemons"))
                .count();

        System.out.println(lemonCount);
    }
}
