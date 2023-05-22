package tp.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReportTest {
    private Report report;
    @Mock
    private List<Book> inventory;
    @Mock
    private List<Transaction> transactions;
    @Mock
    private Book book;
    @Mock
    private Transaction transaction;

    @Before
    public void setUp(){
        this.book = mock(Book.class);
        this.transaction = mock(Transaction.class);
        this.inventory = Arrays.asList(book);
        this.transactions = Arrays.asList(transaction);
        this.report = new Report(inventory, transactions);
    }

    @Test
    public void deveImprimirRelatorioInventario(){
        report.generateReportInventory();
    }

    @Test
    public void deveImprimirRelatorioVendas(){
        when(transaction.getClient()).thenReturn(mock(Client.class));
        when(transaction.getShoppingCart()).thenReturn(mock(ShoppingCart.class));
        report.generateReportSales();
    }

}
