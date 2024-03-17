package MyNewHomeworkUsingGit.l42;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args) {
        String result = IntStream.range(0, 42)
                .mapToObj(i -> String.valueOf(i))
                .collect(Collectors.joining(", "));
    }
}
