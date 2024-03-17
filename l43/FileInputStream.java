package MyNewHomeworkUsingGit.l43;

import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) {
        try (java.io.FileInputStream fis = new java.io.FileInputStream("resources/FileOutputStream and FileInputStream")) {
            int i;

            while ((i = fis.read()) != -1) // т.к., если в файле больше нет букв для считывания, программа выводит -1, задаём это в условие
                System.out.print((char)i);

        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
