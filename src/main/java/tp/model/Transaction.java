package tp.model;

import java.time.LocalDate;

public class Transaction {
    private Client client;
    private ShoppingCart shoppingCart;
    private double totalPurchase;
    private LocalDate date;

    public Transaction(Client client, ShoppingCart shoppingCart, double totalPurchase) {
        this.client = client;
        this.shoppingCart = shoppingCart;
        this.totalPurchase = totalPurchase;
        this.date = LocalDate.now();
    }

    public Client getClient() {
        return client;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }

    public LocalDate getDate() {
        return date;
    }
}
