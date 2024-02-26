package MyNewHomeworkUsingGit.Librarian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookShelf {

    Book[] bookList;
    int bookListInitialSize = 4;
    public int count = 0;
    private List<Book> books = new ArrayList<>();

    public BookShelf() {
        bookList = new Book[bookListInitialSize];
    }

    public void getBook(Book myBook) {
        bookList[count] = myBook;
        count++;
    }

    void addBook(String title, String author, int year) {
        books.add(new Book(title, author, year));
    }

    public class Iterator {
        void lookAtTheBook() {
            Scanner scanner = new Scanner(System.in);
            int bookChoice;
            do {
                System.out.println("Выберите номер места вашей книжной полки (1-4), нажмите 999 для просмотра всех ячеек или 666 для выхода из программы");
                bookChoice = scanner.nextInt();
                if (1 <= bookChoice && bookChoice <= 4 || bookChoice == 666 || bookChoice == 999) {
                    switch (bookChoice) {
                        case 1:
                            System.out.println("Вы смотрите на книгу" + bookList[0]);
                            break;
                        case 2:
                            System.out.println("Вы смотрите на книгу" + bookList[1]);
                            break;
                        case 3:
                            System.out.println("Вы смотрите на книгу" + bookList[2]);
                            break;
                        case 4:
                            System.out.println("Вы смотрите на книгу" + bookList[3]);
                            break;
                        case 999:
                            ShowAllTheBooks();
                        case 666:
                            System.out.println("Вы вышли из программы");
                    }
                } else {
                    System.out.println("На этом месте нет книги или вы ввели неверный номер");
                }
            } while (bookChoice != 666);
        }
        void ShowAllTheBooks() {
            System.out.println(bookList[0] + "\n" + bookList[1] + "\n" + bookList[2] + "\n" + bookList[3] + "\n");
        }
    }

    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", " + year;
        }
    }

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("One Hundred Years of Solitude", "Gabriel García Márquez", 1967);
        bookShelf.addBook("Moby-Dick", "Herman Melville", 1851);
        bookShelf.addBook("Crime and Punishment", "Fyodor Dostoevsky", 1866);
        bookShelf.addBook("Don Quixote", "Miguel de Cervantes", 1605);
    }
}

