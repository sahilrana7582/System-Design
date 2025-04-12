package example_two_document_editor;

import java.time.LocalDateTime;

public class PDF extends Document{

    public PDF(String name, LocalDateTime creationDate, LocalDateTime lastModified, double size, String extension, String content) {
        super(name, creationDate, lastModified, size, extension, content);
    }

    protected PDF(PDF pdf) {
        super(pdf);
    }

    @Override
    public Document clone() {
        return new PDF(this);
    }


}
