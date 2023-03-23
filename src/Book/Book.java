package Book;
// Создайте класс Book (книга), в конструктор которого передавайте автора,
// название книги и количество страниц.
//
// Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
// а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").


// Используйте класс Book (книга) из предыдущего домашнего задания.
// Создайте компаратор, который позволит сортировать книги по названию, при одинаковых названиях -
// по автору (и там, и там - по алфавиту)

public class Book implements Comparable<Book> {
  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getNumPages() {
    return pages;
  }

  @Override
  public int compareTo(Book other) {
    int result = author.compareTo(other.getAuthor());
    if (result == 0) {
      result = title.compareTo(other.getTitle());
    }
    return result;
  }
}
