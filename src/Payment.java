import java.sql.Date;

public class Payment {
    private String paymentId;
    private double amount;
    private Date paymentDate;
    private String method;
    
    public Payment(String paymentId, double amount, Date paymentDate, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.method = method;
    }

    @Override
    public String toString() {
        return "Payment [Id=" + paymentId + "\n, amount=" + amount + "\n, paymentDate=" + paymentDate + "\n, method="
                + method + "]";
    }

    

    
}
