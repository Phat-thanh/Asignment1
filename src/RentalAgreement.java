import java.util.Date;

public class RentalAgreement {
    private String agreementId;
    private Property property;
    private Tenant Tenant;
    private Owner owner;
    private Date startDate;
    private String rentalPeriod;
    private double rentalFee;
    private String status;
    
    public RentalAgreement(String agreementId, Property property, Tenant tenant, Owner owner, Date startDate,
            String rentalPeriod, double rentalFee, String status) {
        this.agreementId = agreementId;
        this.property = property;
        Tenant = tenant;
        this.owner = owner;
        this.startDate = startDate;
        this.rentalPeriod = rentalPeriod;
        this.rentalFee = rentalFee;
        this.status = status;
    }

    @Override
    public String toString() {
        return "RentalAgreement [Id=" + agreementId + ", \nproperty=" + property.getAddress() + ", \nTenant=" + Tenant.getFullName()
                + ", \nowner=" + owner.getFullName() + ", \nstartDate=" + startDate + ", \nrentalPeriod=" + rentalPeriod + ", \nFee="
                + rentalFee + ", \nstatus=" + status + "]";
    }

    

    
}
