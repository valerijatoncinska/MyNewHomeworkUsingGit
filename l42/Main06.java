package MyNewHomeworkUsingGit.l42;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main06 {
    public static void main(String[] args) {
        String[] strings = {"Lorem",  "ipsum",  "dolor",  "sit",  "amet,", "consectetur",  "adipiscing",
                "elit,",  "sed",  "do",  "eiusmod",  "tempor",  "incididunt",  "ut",  "labore",
                "et",  "dolore",  "magna",  "aliqua.",  "Ut",  "enim",  "ad",  "minim",  "veniam,",
                "quis",  "nostrud",  "exercitation",  "ullamco",  "laboris",  "nisi",  "ut",  "aliquip",
                "ex",  "ea",  "commodo",  "consequat.",  "Duis",  "aute",  "irure",  "dolor",  "in",
                "reprehenderit",  "in",  "voluptate",  "velit",  "esse",  "cillum",  "dolore",  "eu",
                "fugiat",  "nulla",  "pariatur.",  "Excepteur",  "sint",  "occaecat",  "cupidatat",  "non",
                "proident,",  "sunt",  "in",  "culpa",  "qui",  "officia",  "deserunt",  "mollit",  "anim",
                "id",  "est",  "laborum.",  ""};
        Long dolorCount = Arrays.stream(strings).filter(s -> s.equals("dolor")).count();
        System.out.println(dolorCount + "\n---------------------------------------------------------------------------------------------------------");

        boolean result = Stream.of(strings).anyMatch(s -> s.length() > 8);
        System.out.println(result);



    }
}
