package tp.model;

public class Assessment {
    private Client client;
    private Book book;
    private int score;
    private String comment;

    public Assessment(Client client, Book book, int score, String comment) {
        this.client = client;
        this.book = book;
        this.score = score;
        this.comment = comment;
    }

    public Client getClient() {
        return client;
    }

    public Book getBook() {
        return book;
    }

    public int getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }

    public void showAssessment() {
        System.out.println("Avaliação de " + book.getTitle() + " por " + client.getName());
        System.out.println("Score: " + score);
        System.out.println("Comentário: " + comment);
    }
}
