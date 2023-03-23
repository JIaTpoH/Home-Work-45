package Book;

import java.util.Comparator;

public interface SortBook extends Comparator<Book> {
  @Override
  default int compare(Book o1, Book o2) {
    int titleCompare = o1.getTitle().compareTo(o2.getTitle());
    if (titleCompare == 0) {
      return o1.getAuthor().compareTo(o2.getAuthor());
    }
    return titleCompare;
  }
}
