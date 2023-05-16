public class Book {
    private String title;
    private String author;
    private String publishingCompany;
    private int publicationYear;

    public Book(String title, String author, String publishingCompany, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.publicationYear = publicationYear;
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
        System.out.println("Autor: " + author);
        System.out.println("Editora: " + publishingCompany);
        System.out.println("Ano de Publicação: " + publicationYear);
    }

    // implementar
    public double getPrice() {
        return 0;
    }
}
