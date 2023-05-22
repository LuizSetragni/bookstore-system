package com.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import com.model.Book;
import com.model.Stock;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class StockTest {
    private Stock stock;
    @Mock
    private Map<Book, Integer> bookQuantity;
    @Mock
    private Book book;
    @Before
    public void setUp(){
        this.bookQuantity = mock(HashMap.class);
        this.book = mock(Book.class);
        this.stock = new Stock();
    }

    @Test
    public void deveAdicionarLivro(){
        stock.addBook(book, 2);
        assertEquals(2, stock.getQuantityAvailable(book));
    }

    @Test
    public void deveRemoverLivro(){
        stock.addBook(book, 2);
        stock.removeBook(book, 1);
        assertEquals(1, stock.getQuantityAvailable(book));
    }

    @Test
    public void deveRetornarQuantidadeLivrosEstoque(){
        stock.addBook(book, 2);
        assertEquals(2, stock.getQuantityAvailable(book));
    }
}
