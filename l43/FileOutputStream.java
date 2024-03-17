package MyNewHomeworkUsingGit.l43;

import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) {
        try (java.io.FileOutputStream fout = new java.io.FileOutputStream("resources/FileOutputStream and FileInputStream", true)) {

            String str = "Lemon"; // создаю строку, которую собираюсь ввести в файл
            char[] cr = str.toCharArray(); // переопределяю тип данных из String в char
            int i;

            for (i = 0; i < str.length(); i++) {
                fout.write(cr[i]);
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
