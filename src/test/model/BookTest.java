import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testGetTitle() {
        Book book = new Book("Book 1", "Author 1", "Publisher", 2021, 19.99, 10);
        assertEquals("Book 1", book.getTitle());
    }

    // Outros métodos de teste aqui...
}
