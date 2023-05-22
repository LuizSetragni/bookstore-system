package com.model;

public class Review {
    private Client client;
    private Book book;
    private int rating;
    private String comment;

    public Review(Client client, Book book, int rating, String comment) {
        this.client = client;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
    }

    public Client getClient() {
        return client;
    }

    public Book getBook() {
        return book;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public void showReview() {
        System.out.println("Cliente: " + client.getName());
        System.out.println("Livro: " + book.getTitle());
        System.out.println("Avaliação: " + rating);
        System.out.println("Comentário: " + comment);
    }
}
