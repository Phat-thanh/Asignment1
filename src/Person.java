import java.util.Date;

/**
 * Base class representing a person in the system.
 */
public class Person {
    private String id;
    private String fullName;
    private Date dateOfBirth;
    private String contactInfo;

    public Person(String id, String fullName, Date dateOfBirth, String contactInfo) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "Person [ID=" + id + ", \nName=" + fullName + ", \nDOB=" + dateOfBirth + ", \nContact Info=" + contactInfo + "]";
    }
}
