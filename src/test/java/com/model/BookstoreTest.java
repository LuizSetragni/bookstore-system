package com.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
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

    @Test
    public void deveRetornarClienteNaoEncontrado() {
        when(client.getName()).thenReturn("Laura Palmer");
        bookstore.makePurchase(client, shoppingCart);
        List<Transaction> transactions = bookstore.getTransactions();
        assertEquals(0, transactions.size());
        verify(shoppingCart, never()).emptyCart();
    }

    @Test
    public void deveRetornarCarrinhoVazio() {
        when(client.getName()).thenReturn("Laura Palmer");
        when(shoppingCart.getBooks()).thenReturn(new ArrayList<>());
        bookstore.registerClient(client);
        bookstore.makePurchase(client, shoppingCart);
        List<Transaction> transactions = bookstore.getTransactions();
        assertEquals(0, transactions.size());
        verify(shoppingCart, never()).emptyCart();
    }
}
