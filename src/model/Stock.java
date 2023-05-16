import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<Book, Integer> bookQuantity;

    public Stock() {
        bookQuantity = new HashMap<>();
    }

    public void addBook(Book book, int quantity) {
        int currentQuantity = bookQuantity.getOrDefault(book, 0);
        bookQuantity.put(book, currentQuantity + quantity);
    }

    public void removerLivro(Book book, int quantity) {
        int currentQuantity = bookQuantity.getOrDefault(book, 0);
        if (quantity <= currentQuantity) {
            bookQuantity.put(book, currentQuantity - quantity);
        } else {
            bookQuantity.remove(book);
        }
    }

    public int getQuantidadeDisponivel(Book book) {
        return bookQuantity.getOrDefault(book, 0);
    }
}
