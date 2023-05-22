package tp.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentTest {
    private Payment payment;
    private double value;
    private String method;

    @Before
    public void setUp() {
        this.value = 1.00;
        this.method = "PIX";
        this.payment = new Payment(value, method);
    }

    @Test
    public void deveRetornarValue(){
        assertEquals(value, payment.getValue(), 1);
    }

    @Test
    public void deveRetornarMethod(){
        assertEquals(method, payment.getMethod());
    }

    @Test
    public void deveImprimirPayment(){
        payment.makePayment();
    }
}
