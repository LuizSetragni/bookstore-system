import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> inventory;
    private List<Client> clients;
    private List<Transaction> transactions;

    public Bookstore() {
        inventory = new ArrayList<>();
        clients = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void removeBook(Book book) {
        inventory.remove(book);
    }

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void makePurchase(Client client, ShoppingCart shoppingCart) {

        if (!clients.contains(client)) {
            System.out.println("Client não cadastrado na Livraria.");
            return;
        }

        if (shoppingCart.getBooks().isEmpty()) {
            System.out.println("Carrinho vazio. Nenhuma compra realizada.");
            return;
        }

        double totalPurchase = shoppingCart.calculateTotalPurchase();

        Transaction transaction = new Transaction(client, shoppingCart, totalPurchase);

        transactions.add(transaction);

        shoppingCart.emptyCart();

        System.out.println("Compra realizada com sucesso!");
        System.out.println("Total: R$" + totalPurchase);
    }

    public void generateReportSales() {
        System.out.println("Relatório de Vendas:");
        for (Transaction transaction : transactions) {
            System.out.println("Client: " + transaction.getClient().getName());
            System.out.println("Books comprados:");
            for (Book book : transaction.getShoppingCart().getBooks()) {
                System.out.println("- " + book.getTitle() + " (" + book.getAuthor() + ")");
            }
            System.out.println("Total: R$" + transaction.getTotalPurchase());
            System.out.println("--------------------");
        }
    }
}
