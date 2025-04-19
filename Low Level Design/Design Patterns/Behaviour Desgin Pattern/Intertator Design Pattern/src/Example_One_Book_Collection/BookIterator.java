package Example_One_Book_Collection;

import java.util.List;

public class BookIterator  implements Iterator<Book> {
    private List<Book> bookCollection;
    private int index;
    public BookIterator(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookCollection.size();
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public Book getCurrent() {
        return bookCollection.get(index);
    }

}
