package com.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import com.model.Book;
import com.model.Client;
import com.model.Review;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ReviewTest {
    private Review review;
    @Mock
    private Client client;
    @Mock
    private Book book;
    private int rating;
    private String comment;

    @Before
    public void setUp(){
        this.client = mock(Client.class);
        this.book = mock(Book.class);
        this.rating = 5;
        this.comment = "Literatura incrível!";
        this.review = new Review(client, book, rating, comment);
    }

    @Test
    public void deveRetornarClient(){
        assertEquals(client, review.getClient());
    }

    @Test
    public void deveRetornarBook(){
        assertEquals(book, review.getBook());
    }

    @Test
    public void deveRetornarRating(){
        assertEquals(rating, review.getRating());
    }

    @Test
    public void deveRetornarComment(){
        assertEquals(comment, review.getComment());
    }

    @Test
    public void deveImprimirReview(){
        review.showReview();
    }
}
