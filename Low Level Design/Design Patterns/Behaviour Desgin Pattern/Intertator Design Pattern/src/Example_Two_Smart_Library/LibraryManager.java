package Example_Two_Smart_Library;

public class LibraryManager {
    public static <T extends LibraryItem> void printCollection(Iterator<T> iterator) {
        while (iterator.hasNext()) {
            T item = iterator.next();
            System.out.println("Title: " + item.getTitle());
            System.out.println("------------------------");
        }
    }
}
