package com.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class TransactionTest {
    private Transaction transaction;
    @Mock
    private Client client;
    @Mock
    private ShoppingCart shoppingCart;
    private double totalPurchase;
    @Mock
    private LocalDate localDate;

    @Before
    public void setUp() {
        this.client = mock(Client.class);
        this.shoppingCart = mock(ShoppingCart.class);
        this.totalPurchase = 1.00;
        this.localDate = LocalDate.now();
        this.transaction = new Transaction(client, shoppingCart, totalPurchase);
    }

    @Test
    public void deveRetornarClient() {
        assertEquals(client, transaction.getClient());
    }

    @Test
    public void deveRetornarShoppingCart() {
        assertEquals(shoppingCart, transaction.getShoppingCart());
    }

    @Test
    public void deveRetornarTotalPurchase() {
        assertEquals(totalPurchase, transaction.getTotalPurchase(), 1);
    }

    @Test
    public void deveRetornarLocalDate() {
        assertEquals(localDate, transaction.getDate());
    }
}
