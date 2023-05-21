public class Main {
    public static void main(String[] args) {
        // Criando objetos do tipo Book
        // Book book1 = new Book("Book 1", "Autor 1", 19.99);
        // Book book2 = new Book("Book 2", "Autor 2", 29.99);
        // Book book3 = new Book("Book 3", "Autor 3", 14.99);

        Book book1 = new Book("Book 1", "Autor 1", "lulu", 2020);
        Book book2 = new Book("Book 2", "Autor 2", "lele", 2021);
        Book book3 = new Book("Book 3", "Autor 3", "lala", 2022);

        // Criando objetos do tipo Client
        Client client1 = new Client("João", "rua 1", "35327171");
        Client client2 = new Client("Maria", "rua 0", "310909090");

        // Criando objeto do tipo ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Adicionando livros ao shoppingCart
        shoppingCart.addBook(book1);
        shoppingCart.addBook(book2);

        // Criando objeto do tipo Bookstore
        Bookstore bookstore = new Bookstore();

        // Adicionando livros ao inventário da bookstore
        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);

        // Cadastrando clientes na bookstore
        bookstore.registerClient(client1);
        bookstore.registerClient(client2);

        // Realizando uma compra
        bookstore.makePurchase(client1, shoppingCart);

        // Criando objetos do tipo Payment
        Payment payment1 = new Payment(49.98, "Cartão de Crédito");
        Payment payment2 = new Payment(14.99, "PayPal");

        // Realizando pagamentos
        payment1.makePayment();
        payment2.makePayment();

        // Criando objeto do tipo Assessment
        Assessment assessment = new Assessment(client1, book1, 5, "Ótimo livro!");

        // Exibindo a avaliação
        assessment.showAssessment();

        // Criando objeto do tipo Stock
        Stock stock = new Stock();

        // Adicionando livros ao stock
        stock.addBook(book1, 5);
        stock.addBook(book2, 3);

        // Removendo livros do stock
        stock.removeBook(book1, 2);

        // Obtendo a quantidade disponível de um livro no stock
        int quantityAvailable = stock.getQuantityAvailable(book1);
        System.out.println("Quantidade disponível do livro 1: " + quantityAvailable);

        // Criando objeto do tipo Report
        // Report report = new Report(bookstore.getInventario(),
        // bookstore.getTransacoes());

        // Gerando relatórios
        // report.generateReportInventory();
        // report.generateReportSales();
    }
}
