public class ResidentialProperty extends Property {
    private int bedrooms;
    private boolean allowPet;

    public ResidentialProperty(String propertyId,String address,double price,String status, int bedrooms, boolean allowPet){
        super(propertyId, address, price, status);
        this.bedrooms= bedrooms;
        this.allowPet= allowPet;
    }

    @Override
    public String toString() {
        return "ResidentialProperty [bedrooms=" + bedrooms + ", \nallowPet=" + allowPet + "]";
    }

    
    
}
