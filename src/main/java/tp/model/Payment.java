package tp.model;

public class Payment {
    private double value;
    private String method;

    public Payment(double value, String method) {
        this.value = value;
        this.method = method;
    }

    public double getValue() {
        return value;
    }

    public String getMethod() {
        return method;
    }

    public void makePayment() {
        System.out.println("Pagamento de R$" + value + " realizado via " + method);
    }
}
