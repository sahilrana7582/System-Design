package Example_Two_Smart_Library;

public class NewsPaper implements LibraryItem {


    private String title;
    private String author;
    private String genre;
    private int pages;

    public NewsPaper(String title, String author, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public int getPages() {
        return this.pages;
    }
}
