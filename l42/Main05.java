package MyNewHomeworkUsingGit.l42;

import java.util.stream.IntStream;

public class Main05 {

    public static void main(String[] args) {
        int[] data = {5,3,4,6,55,4,7,56,53,4,4,4};
        IntStream.of(data)
                .sorted()
                .skip(data.length - 5)
                .forEach(i -> System.out.println(i));

        // или

        int[] result = IntStream.of(data)
                .sorted()
                .skip(data.length - 5)
                .toArray();

    }
}
