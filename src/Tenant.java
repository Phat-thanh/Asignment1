import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Tenant extends Person {
    private List<RentalAgreement> RentalAgreements;
    private List<Payment> paymentHistory;

    public Tenant(String id, String fullname, Date dateOfBirth, String contactInfo){
        super(id, fullname, dateOfBirth, contactInfo);
        this.RentalAgreements= new ArrayList<>();
        this.paymentHistory = new ArrayList<>();


    }

}
