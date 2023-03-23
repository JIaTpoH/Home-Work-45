package Book;

import java.util.Comparator;

public class SortBook implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    int titleCompare = o1.getTitle().compareTo(o2.getTitle());
    if (titleCompare == 0) {
      return o1.getAuthor().compareTo(o2.getAuthor());
    }
    return titleCompare;
  }
}
