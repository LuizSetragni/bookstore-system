package com.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import com.model.Book;
import com.model.Bookstore;
import com.model.Client;
import com.model.ShoppingCart;
import com.model.Transaction;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookstoreTest {
    private Bookstore bookstore;
    @Mock
    private Book book;
    @Mock
    private Client client;
    @Mock
    private ShoppingCart shoppingCart;
    @Mock
    private Transaction transaction;

    @Before
    public void setUp() {
        this.book = mock(Book.class);
        this.client = mock(Client.class);
        this.shoppingCart = mock(ShoppingCart.class);
        this.transaction = mock(Transaction.class);
        this.bookstore = new Bookstore();
    }

    @Test
    public void deveAdicionarLivro() {
        bookstore.addBook(book);
        assertEquals(1, bookstore.getInventory().size());
    }

    @Test
    public void deveRemoverLivro() {
        bookstore.addBook(book);
        bookstore.removeBook(book);
        assertEquals(0, bookstore.getInventory().size());
    }

    @Test
    public void deveRegistrarClient() {
        bookstore.registerClient(client);
        assertEquals(1, bookstore.getClients().size());
    }

    @Test
    public void deveRealizarVenda() {
        bookstore.registerClient(client);
        when(shoppingCart.getBooks()).thenReturn(Arrays.asList(book));
        when(shoppingCart.calculateTotalPurchase()).thenReturn(55.60);
        bookstore.makePurchase(client, shoppingCart);
    }

    @Test
    public void deveGerarRelatorioVenda() {
        bookstore.registerClient(client);
        when(transaction.getClient()).thenReturn(mock(Client.class));
        when(transaction.getShoppingCart()).thenReturn(mock(ShoppingCart.class));
        when(transaction.getTotalPurchase()).thenReturn(55.60);
        bookstore.generateReportSales();
    }

    @Test
    public void deveRetornarListaInventarioCheia() {
        bookstore.addBook(book);
        assertEquals(1, bookstore.getInventory().size());
    }

    @Test
    public void deveRetornarListaInventarioVazia() {
        assertEquals(Collections.emptyList(), bookstore.getInventory());
    }

    @Test
    public void deveRetornarListaTransacoesCheia() {
        bookstore.setTransactions(Arrays.asList(transaction));
        assertEquals(1, bookstore.getTransactions().size());
    }

    @Test
    public void deveRetornarListaTransacoesVazia() {
        assertEquals(Collections.emptyList(), bookstore.getTransactions());
    }

    @Test
    public void deveSetarInventario() {
        bookstore.setInventory(Arrays.asList(book));
        assertEquals(1, bookstore.getInventory().size());
    }

    @Test
    public void deveSetarCliente() {
        bookstore.setClients(Arrays.asList(client));
        assertEquals(1, bookstore.getClients().size());
    }
}
