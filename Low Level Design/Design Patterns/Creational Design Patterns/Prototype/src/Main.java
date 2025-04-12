import example_one.Rectangle;
import example_one.Shape;
import example_one.Square;
import example_three_game_characters.Character;
import example_three_game_characters.CharacterRegistery;
import example_three_game_characters.Warrior;
import example_two_document_editor.Document;
import example_two_document_editor.PDF;
import example_two_document_editor.Word;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

//        Shape square = new Square("10");
//        Shape rectangle = new Rectangle("10", "20");
//
//        Shape squareCopy = square.clone();
//        Shape rectangleCopy = rectangle.clone();
//
//        System.out.println("Original Square: " + square);
//        System.out.println("Cloned Square: " + squareCopy);
//
//        System.out.println("Original Rectangle: " + rectangle);
//        System.out.println("Cloned Rectangle: " + rectangleCopy);


//        Document wordDocument = new Word("word", LocalDateTime.now(), LocalDateTime.now(), 10.0, "docx", "content");
//
//
//        System.out.println("Original Document: " + wordDocument);
//
//        Document wordDocumentCopy = wordDocument.clone();
//
//        System.out.println("Cloned Document: " + wordDocumentCopy);
//
//        System.out.println("-----------------------------------------------");
//
//        Document pdfDocument = new PDF("pdf", LocalDateTime.now(), LocalDateTime.now(), 10.0, "pdf", "content");
//
//        System.out.println("Original Document: " + pdfDocument);
//
//        Document pdfDocumentCopy = pdfDocument.clone();
//
//        System.out.println("Cloned Document: " + pdfDocumentCopy);


        Character warrior1 = new Warrior("warrior1", "100", 10);
        warrior1.addSkill("Fire", "Firing Skill");
        warrior1.addSkill("Water", "Water Skill");

        System.out.println("Original Character: " + warrior1);
        Character warrior1Copy = warrior1.clone();
        System.out.println("Cloned Character: " + warrior1Copy);

        System.out.println("Putting In the Registry ------------------");

        CharacterRegistery characterRegistery = new CharacterRegistery();
        characterRegistery.registerCharacter("Warrior", warrior1);
        Character warrior2 = characterRegistery.createCharacter("Warrior");
        System.out.println("Cloned Character From The Registry: " + warrior2);
    }
}
