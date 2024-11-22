import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Host extends Person{ 
    private List<Property> managedProperties;

    public Host (String id, String fullName, Date dateOfBirth, String contactInfo){
        super(id, fullName, dateOfBirth, contactInfo);
        this.managedProperties = new ArrayList<>();
    }

    public List<Property> getManagedProperties() {
        return managedProperties;
    }

    public void addManagedPropety (Property property){
        managedProperties.add(property);
    }

    @Override
    public String toString() {
        return super.toString() + "Host [managedProperties=" + managedProperties.size() + "]";
    }

    
    
}
