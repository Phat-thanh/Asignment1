import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Owner extends Person{
    private List<Property> ownedProperties;

    public Owner(String id, String fullName, Date dateOfBirth, String contactInfo){
        super(id, fullName, dateOfBirth, contactInfo);
        this.ownedProperties = new ArrayList<>();
    }

    public List<Property> getOwnProperties(){
        return ownedProperties;
    }
    
    public void addOwnedProperties (Property property){
        ownedProperties.add(property);
    }

    @Override
    public String toString() {
        return super.toString()+ "Owner [ownedProperies=" + ownedProperties.size() + "]";
    }

    
    
}
