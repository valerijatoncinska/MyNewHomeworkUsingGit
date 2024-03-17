package MyNewHomeworkUsingGit.l43;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader используется для буферизированного чтения
// текста из файла. Метод readLine() читает текст построчно
// до тех пор, пока не встретит null, что означает конец файла.
public class ReadByReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("resources/text2")) {
            BufferedReader br = new BufferedReader(fr);

            do {
                String line = br.readLine();
                if (line == null)
                    break;
                System.out.print(line);
            } while (true);
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}
