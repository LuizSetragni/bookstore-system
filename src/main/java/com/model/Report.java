package com.model;

import java.util.List;

public class Report {
    private List<Book> inventory;
    private List<Transaction> transactions;

    public Report(List<Book> inventory, List<Transaction> transactions) {
        this.inventory = inventory;
        this.transactions = transactions;
    }

    public void generateReportInventory() {
        System.out.println("Relatório de Inventário:");
        for (Book book : inventory) {
            System.out.println("Book: " + book.getTitle());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Quantidade disponível: " + book.getQuantity());
            System.out.println("--------------------");
        }
    }

    public void generateReportSales() {
        System.out.println("Relatório de Vendas:");
        for (Transaction transaction : transactions) {
            System.out.println("Data: " + transaction.getDate());
            System.out.println("Cliente: " + transaction.getClient().getName());
            System.out.println("Livros comprados:");
            for (Book book : transaction.getShoppingCart().getBooks()) {
                System.out.println("- " + book.getTitle() + " (" + book.getAuthor() + ")");
            }
            System.out.println("Total: R$" + transaction.getTotalPurchase());
            System.out.println("--------------------");
        }
    }
}
