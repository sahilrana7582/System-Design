package Book_Parser_Example;

public class BookParseProxey implements BookParseProxyInterface{

    private BookParser bookParser;


    private void createBookParser(){
        System.out.println("Creating Book Parser...");
        bookParser = new BookParser("Book Name", "Author", 1000, 10);
    }

    public boolean hasBook(){
        return bookParser != null;
    }


    @Override
    public void getBookName() {
        if(!hasBook()){
            createBookParser();
        }
        bookParser.getBookName();
    }

    @Override
    public void getAuthor() {
        if(!hasBook()){
            createBookParser();
        }
        bookParser.getAuthor();
    }

    @Override
    public void getNumberOfPages() {
        if(!hasBook()){
            createBookParser();
        }
        bookParser.getNumberOfPages();
    }

    @Override
    public void getNumberOfChapters() {
        if(!hasBook()){
            createBookParser();
        }
        bookParser.getNumberOfChapters();
    }
}
