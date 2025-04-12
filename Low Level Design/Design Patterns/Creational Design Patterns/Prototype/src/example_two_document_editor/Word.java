package example_two_document_editor;

import java.time.LocalDateTime;

public class Word extends Document {

    public Word(String name, LocalDateTime creationDate, LocalDateTime lastModified, double size, String extension, String content) {
        super(name, creationDate, lastModified, size, extension, content);
    }

    protected Word(Word word) {
        super(word);
    }

    @Override
    public Document clone() {
        return new Word(this);
    }




}
