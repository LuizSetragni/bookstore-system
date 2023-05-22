package tp.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

public class ShoppingCartTest {
    private ShoppingCart shoppingCart;
    @Mock
    private List<Book> books;
    @Mock
    private Book book;

    @Before
    public void setUp() {
        this.book = mock(Book.class);
        this.books = mock(List.class);
        this.shoppingCart = new ShoppingCart();
    }

    @Test
    public void deveAdicionarLivroCarrinho() {
        shoppingCart.addBook(book);
        assertTrue(shoppingCart.getBooks().contains(book));
    }

    @Test
    public void deveRemoverLivroCarrinho() {
        shoppingCart.removeBook(book);
        assertFalse(shoppingCart.getBooks().contains(book));
    }
    @Test
    public void deveCalcularValorCarrinho() {
        shoppingCart.addBook(mockBook());
        assertEquals(59.90, shoppingCart.calculateTotalPurchase(), 1);
    }

    @Test
    public void deveImprimirCarrinho(){
        shoppingCart.addBook(mockBook());
        shoppingCart.showShoppingCart();
    }

    @Test
    public void deveRetornarCarrinhoComItens(){
        shoppingCart.addBook(mockBook());
        assertEquals(1, shoppingCart.getBooks().size());
    }

    @Test
    public void deveRetornarCarrinhoVazio(){
        assertEquals(Collections.emptyList(), shoppingCart.getBooks());
    }

    @Test
    public void deveLimparCarrinho(){
        shoppingCart.addBook(mockBook());
        shoppingCart.emptyCart();
        assertEquals(Collections.emptyList(), shoppingCart.getBooks());
    }

    private Book mockBook(){
        return new Book("O Diário Secreto de Laura Palmer", "Jennifer Lynch", "Globo Livros", 1990, 59.90, 1);
    }

}
