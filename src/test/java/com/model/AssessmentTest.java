package com.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import com.model.Assessment;
import com.model.Book;
import com.model.Client;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class AssessmentTest {

    private Assessment assessment;
    @Mock
    private Client client;
    @Mock
    private Book book;

    @Before
    public void setUp() {
        this.client = mock(Client.class);
        this.book = mock(Book.class);
        this.assessment = new Assessment(client, book, 0, "comment");
    }

    @Test
    public void deveRetornarMockClient() {
        assertEquals(client, assessment.getClient());
    }

    @Test
    public void deveRetornarMockBook() {
        assertEquals(book, assessment.getBook());
    }

    @Test
    public void deveRetornarScore() {
        assertEquals(0, assessment.getScore());
    }

    @Test
    public void deveRetornarComment() {
        assertEquals("comment", assessment.getComment());
    }

    @Test
    public void deveImprimirAssessment() {
        assessment.showAssessment();
    }
}
