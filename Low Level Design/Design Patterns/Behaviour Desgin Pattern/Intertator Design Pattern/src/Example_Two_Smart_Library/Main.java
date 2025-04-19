package Example_Two_Smart_Library;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F Scott Fitzgerald", "Fiction", 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 336);
        Book book3 = new Book("1984", "George Orwell", "Dystopian", 328);
        BookCollection bookCollection = new BookCollection(new ArrayList<>());

        bookCollection.addBook(book1);
        bookCollection.addBook(book2);
        bookCollection.addBook(book3);

        NewsPaper newsPaper1 = new NewsPaper("The New York Times", "The New York Times", "News", 500);
        NewsPaper newsPaper2 = new NewsPaper("The Washington Post", "The Washington Post", "News", 600);
        NewsPaper newsPaper3 = new NewsPaper("The Wall Street Journal", "The Wall Street Journal", "News", 700);

        NewsPaperCollection newsPaperCollection = new NewsPaperCollection();

        newsPaperCollection.addNewspaper(newsPaper1);
        newsPaperCollection.addNewspaper(newsPaper2);
        newsPaperCollection.addNewspaper(newsPaper3);

        LibraryManager.printCollection(newsPaperCollection.getIterator());

        LibraryManager.printCollection(bookCollection.getIterator());



    }

}
