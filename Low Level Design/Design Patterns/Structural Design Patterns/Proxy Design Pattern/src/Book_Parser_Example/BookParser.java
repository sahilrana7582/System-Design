package Book_Parser_Example;

public class BookParser implements BookParseProxyInterface {

    private String bookName;
    private String author;
    private int numberOfPages;
    private int numberOfChapters;

    public BookParser(String bookName, String author, int numberOfPages, int numberOfChapters) {
        try{
            System.out.println("Parsing Book...");
            Thread.sleep(5000);

        }catch (Exception e){
            System.out.println("Something Went Wrong!");
        }
        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.numberOfChapters = numberOfChapters;
        System.out.println("Book Parsed Successfully!");
    }

    @Override
    public void getBookName() {
        System.out.println("Book Name: " + bookName);
    }

    @Override

    public void getAuthor() {
        System.out.println("Author: " + author);
    }

    @Override
    public void getNumberOfPages() {
        System.out.println("Number of Pages: " + numberOfPages);
    }

    @Override
    public void getNumberOfChapters() {
        System.out.println("Number of Chapters: " + numberOfChapters);
    }


}
