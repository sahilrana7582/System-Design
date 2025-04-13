import java.time.LocalDate;

public class Invoice {

    private String invoiceId;
    private LocalDate invoiceDate;
    private Address customerAddress;
    private double amountPaid;
    private double taxPaid;

    public Invoice(String invoiceId, LocalDate invoiceDate, Address customerAddress, double total, float tax) {
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
        this.customerAddress = customerAddress;
        this.taxPaid = total * tax;
        this.amountPaid = total + this.taxPaid;
    }
}
