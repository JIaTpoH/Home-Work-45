package Book;

import java.util.Comparator;

public interface SortBook extends Comparator<Book> {
  @Override
  default int compare(Book o1, Book o2){
    return o1.getNumPages() - o2.getNumPages();
  }
}
