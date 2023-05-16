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

    public void realizarPayment() {
        System.out.println("Pagamento de R$" + value + " realizado via " + method);
    }
}
