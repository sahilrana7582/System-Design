package Example_Two_Smart_Library;


import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books;

    public BookCollection(List<Book> bookCollection) {
        this.books = bookCollection;
    }


    public BookCollection(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Iterator<Book> getIterator() {return new BookIterator();}

    private class BookIterator implements Iterator<Book> {
        private int index = 0;
        public boolean hasNext() { return index < books.size(); }
        public Book next() { return books.get(index++); }
        public Book getCurrent() { return books.get(index); }
    }
}
