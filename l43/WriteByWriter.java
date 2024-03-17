package MyNewHomeworkUsingGit.l43;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteByWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("resources/text2.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Мой новый пример!");
            fw.write("Мой новый пример!");
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}
