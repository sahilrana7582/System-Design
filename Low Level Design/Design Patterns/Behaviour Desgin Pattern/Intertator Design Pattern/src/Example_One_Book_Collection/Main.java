package Example_One_Book_Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 336);
        Book book3 = new Book("1984", "George Orwell", "Dystopian", 328);
        BookCollection bookCollection = new BookCollection(new ArrayList<>());
        bookCollection.addBook(book1);
        bookCollection.addBook(book2);
        bookCollection.addBook(book3);
        Iterator<Book> iterator = bookCollection.getIterator();
        while (iterator.hasNext()) {
            Book book = iterator.getCurrent();
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("----------------------------");
            iterator.next();
        }
    }
}
