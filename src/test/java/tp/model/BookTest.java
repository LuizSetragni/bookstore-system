package tp.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testGetTitle() {
        Book book = new Book("Book 1", "Author 1", "Publisher", 2021, 19.99, 10);
        assertEquals("Book 1", book.getTitle());
    }

    @Test
    public void testBookDetails() {
        String title = "The Great Gatsby";
        String author = "F. Scott Fitzgerald";
        String publishingCompany = "Scribner";
        int publicationYear = 1925;
        double price = 19.99;
        int quantity = 10;

        Book book = new Book(title, author, publishingCompany, publicationYear, price, quantity);

        // Verifica se os detalhes do livro estão corretos
        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(publishingCompany, book.getPublishingCompany());
        assertEquals(publicationYear, book.getPublicationYear());
        assertEquals(quantity, book.getQuantity());
    }

    @Test
    public void testSettersAndGetters() {
        Book book = new Book("Title", "Author", "Publisher", 2023, 9.99, 5);

        // Altera os valores dos atributos usando os setters
        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setPublishingCompany("New Publisher");
        book.setPublicationYear(2022);
        book.setPrice(14.99);
        book.setQuantity(3);

        // Verifica se os getters retornam os valores corretos
        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals("New Publisher", book.getPublishingCompany());
        assertEquals(2022, book.getPublicationYear());
        assertEquals(3, book.getQuantity());
    }

//    @Test
//    public void testShowDetail() {
//        String title = "To Kill a Mockingbird";
//        String author = "Harper Lee";
//        String publishingCompany = "J. B. Lippincott & Co.";
//        int publicationYear = 1960;
//        double price = 12.99;
//        int quantity = 8;
//
//        Book book = new Book(title, author, publishingCompany, publicationYear, price, quantity);
//
//        // Redireciona a saída de impressão para uma string
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        // Chama o método showDetail() do livro
//        book.showDetail();
//
//        // Verifica se a saída impressa está correta
//        String expectedOutput = "Book: " + title + "\n" +
//                "Author: " + author + "\n" +
//                "Publishing Company: " + publishingCompany + "\n" +
//                "Publication Year: " + publicationYear;
//        assertEquals(expectedOutput, outputStream.toString().trim());
//    }
}
