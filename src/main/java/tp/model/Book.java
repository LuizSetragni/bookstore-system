package tp.model;

public class Book {
    private String title;
    private String author;
    private String publishingCompany;
    private int publicationYear;
    private double price;
    private int quantity;

    public Book(String title, String author, String publishingCompany, int publicationYear, double price,
            int quantity) {
        this.title = title;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.publicationYear = publicationYear;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void showDetail() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publishing Company: " + publishingCompany);
        System.out.println("Publication Year: " + publicationYear);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
