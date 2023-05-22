package com.model;

import org.junit.Before;
import org.junit.Test;
import com.model.Book;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;
    private String title;
    private String author;
    private String publishingCompany;
    private int publicationYear;
    private double price;
    private int quantity;

    @Before
    public void setUp() {
        this.title = "O Diário Secreto de Laura Palmer";
        this.author = "Jennifer Lynch";
        this.publishingCompany = "Globo Livros";
        this.publicationYear = 1990;
        this.price = 55.60;
        this.quantity = 2;
        this.book = new Book(title, author, publishingCompany, publicationYear, price, quantity);
    }

    @Test
    public void deveRetornarTitle() {
        assertEquals(title, book.getTitle());
    }

    @Test
    public void deveSetarTitle() {
        book.setTitle("O diário de Laura Palmer");
        assertEquals("O diário de Laura Palmer", book.getTitle());
    }

    @Test
    public void deveRetornarAuthor() {
        assertEquals(author, book.getAuthor());
    }

    @Test
    public void deveSetarAuthor() {
        book.setAuthor("David Lynch");
        assertEquals("David Lynch", book.getAuthor());
    }

    @Test
    public void deveRetornarPublishingCompany() {
        assertEquals(publishingCompany, book.getPublishingCompany());
    }

    @Test
    public void deveSetarPublishingCompany() {
        book.setPublishingCompany("Editora PUC");
        assertEquals("Editora PUC", book.getPublishingCompany());
    }

    @Test
    public void deveRetornarPublicationYear() {
        assertEquals(publicationYear, book.getPublicationYear());
    }

    @Test
    public void deveSetarPublicationYear() {
        book.setPublicationYear(2023);
        assertEquals(2023, book.getPublicationYear());
    }

    @Test
    public void deveRetornarPrice() {
        assertEquals(price, book.getPrice(), 1);
    }

    @Test
    public void deveSetarPrice() {
        book.setPrice(85.00);
        assertEquals(85.00, book.getPrice(), 1);
    }

    @Test
    public void deveRetornarQuantity() {
        assertEquals(quantity, book.getQuantity());
    }

    @Test
    public void deveSetarQuantity() {
        book.setQuantity(5);
        assertEquals(5, book.getQuantity());
    }

    @Test
    public void deveImprimirBook() {
        book.showDetail();
    }
}
