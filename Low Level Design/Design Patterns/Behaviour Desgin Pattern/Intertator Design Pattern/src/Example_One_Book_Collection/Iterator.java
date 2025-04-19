package Example_One_Book_Collection;

public interface Iterator<T> {

    boolean hasNext();
    void next();
    T getCurrent();
}
