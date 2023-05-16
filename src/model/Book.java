public class Book {
    private String title;
    private String author;
    private String publishingCompany;
    private int publicationYear;

    // Construtor
    public Book(String title, String author, String publishingCompany, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.publicationYear = publicationYear;
    }

    // Métodos de acesso (getters) e modificação (setters)
    public String getTitulo() {
        return title;
    }

    public void setTitulo(String title) {
        this.title = title;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String author) {
        this.author = author;
    }

    public String getEditora() {
        return publishingCompany;
    }

    public void setEditora(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getAnoPublicacao() {
        return publicationYear;
    }

    public void setAnoPublicacao(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Livro: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Editora: " + publishingCompany);
        System.out.println("Ano de Publicação: " + publicationYear);
    }
}
