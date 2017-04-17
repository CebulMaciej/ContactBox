package contacts;

/**
 * Created by Maciej Cebula on 15.04.2017.
 */
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private int ilosc=0;
    public int getId() {
        return id;
    }
    public Contact(){
        this.id=ilosc++;
    }
    public Contact(String firstName,String lastName,String phoneNumber,String emailAddress){
        this.id=ilosc++;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
