package Example_Two_Smart_Library;


import java.util.ArrayList;
import java.util.List;

class NewsPaperCollection {
    private List<NewsPaper> newspapers = new ArrayList<>();
    public void addNewspaper(NewsPaper news) { newspapers.add(news); }
    public Iterator<NewsPaper> getIterator() { return new NewspaperIterator(); }

    private class NewspaperIterator implements Iterator<NewsPaper> {
        private int index = 0;
        public boolean hasNext() { return index < newspapers.size(); }
        public NewsPaper next() { return newspapers.get(index++); }
        public NewsPaper getCurrent() { return newspapers.get(index); }
    }
}