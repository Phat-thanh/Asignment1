import java.util.Date;

public class Application {
    public static void main(String[] args) {
        //Sample Data
        Owner owner = new Owner("01", "Phat",new Date(), "phat.nguyen@gmail.com");
        Owner owner2 = new Owner("02", "Manh", new Date(), "manh.hung@gmail.com");
        
        Tenant tenant = new Tenant("T1", "Thanh", new Date(), "thanh.nguyen@gmail.com");
        Tenant tenant2 = new Tenant("T2", "John", new Date(), "John.week:)@gmail.com");

        ResidentialProperty property = new ResidentialProperty("P1", "231 D1 Street", 2000, "Available", 2, true);
        ResidentialProperty property2 = new ResidentialProperty("P2", "125 Dong Khoi Street", 312, "Available", 1, false);

        //Create Rental Agreement
        RentalAgreement Agreement = new RentalAgreement("A1", property, tenant, owner, new Date(), "Monthly", 1250,"Active");
        RentalAgreement Agreement2 = new RentalAgreement("A2", property, tenant, owner, new Date(), "Monthly", 400,"Active");


        //Display data
        System.out.println(owner);
        System.out.println("---------------------------");
        System.out.println(tenant);
        System.out.println("---------------------------");
        System.err.println(property);
        System.out.println("---------------------------");
        System.out.println(Agreement);

    }
}
