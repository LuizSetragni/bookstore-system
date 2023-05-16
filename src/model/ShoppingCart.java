import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> books;

    public ShoppingCart() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public double calculateTotalPurchase() {
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }

    public void showShoppingCart() {
        System.out.println("Carrinho de Compras:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (" + book.getAuthor() + ")");
        }
        System.out.println("Total: R$" + calculateTotalPurchase());
    }

    // implementar
    public List<Book> getBooks() {
        return null;
    }

    // implementar
    public void emptyCart() {
    }
}
