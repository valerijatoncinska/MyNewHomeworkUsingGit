package MyNewHomeworkUsingGit.l43;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("resources/text")) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка вывода.");
        }
    }
}
