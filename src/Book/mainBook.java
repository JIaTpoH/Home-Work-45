package Book;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainBook {

  public static void main(String[] args) {
    Book book1 = new Book("Фёдор Достоевский", "Бесы", 555);
    Book book2 = new Book("Михаил Лермонтов", "Маскарад", 321);
    Book book3 = new Book("Лев Толстой", "Война и мир", 1333);

    List<Book> books = new ArrayList<>();
    books.add(book1);
    books.add(book2);
    books.add(book3);


    Collections.sort(books);

    for (Book book : books) {
      System.out.println
          (book.getAuthor() + " - " + book.getTitle() + " - " + book.getNumPages() + " pages");
    }
  }
}