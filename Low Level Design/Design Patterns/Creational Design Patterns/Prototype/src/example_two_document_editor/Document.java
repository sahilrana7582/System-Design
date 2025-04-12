package example_two_document_editor;

import java.sql.Time;
import java.time.LocalDateTime;

public abstract class Document implements Prototype<Document> {
    private String name;
    private LocalDateTime creationDate;
    private LocalDateTime lastModified;
    private double size;
    private String extension;
    private String content;

    protected Document(String name, LocalDateTime creationDate, LocalDateTime lastModified, double size, String extension, String content) {
        this.name = name;
        this.creationDate = creationDate;
        this.lastModified = lastModified;
        this.size = size;
        this.extension = extension;
        this.content = content;
    }

    protected Document(Document document) {
        this.name = document.name;
        this.creationDate = document.creationDate;
        this.lastModified = document.lastModified;
        this.size = document.size;
        this.extension = document.extension;
        this.content = document.content;
    }




    @Override
    public abstract Document clone();

    @Override
    public String toString() {
        return "Word [name=" + name + ", creationDate=" + creationDate + ", lastModified=" + lastModified + ", size=" + size + ", extension=" + extension + ", content=" + content + "]";
    }
}
