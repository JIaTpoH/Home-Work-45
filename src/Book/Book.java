package Book;
// Создайте класс Book (книга), в конструктор которого передавайте автора,
// название книги и количество страниц.
//
// Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
// а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").
public class Book implements Comparable<Book> {
  private String author;
  private String title;
  private int pages;

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

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public void setTitle(String title) {
    this.title = title;
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
