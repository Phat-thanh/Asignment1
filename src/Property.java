public class Property {
    private String propertyId;
    private String address;
    private double price;
    private String status; // Available, Rented, Pending
    
    public Property(String propertyId, String address, double price, String status) {
        this.propertyId = propertyId;
        this.address = address;
        this.price = price;
        this.status = status;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Property [Id=" + propertyId + ", \naddress=" + address + ", \nprice=" + price + ", \nstatus=" + status
                + "]";
    }

    
    

    
}
