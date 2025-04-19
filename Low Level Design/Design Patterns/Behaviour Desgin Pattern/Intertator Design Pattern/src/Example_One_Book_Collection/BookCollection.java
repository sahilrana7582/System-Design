package Example_One_Book_Collection;

import java.util.List;

public class BookCollection implements Interable<Book> {

    private List<Book> bookCollection;

    public BookCollection(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public void addBook(Book book) {
        bookCollection.add(book);
    }

    @Override
    public Iterator<Book> getIterator() {
        return new BookIterator(bookCollection);
    }
}
