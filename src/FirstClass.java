import java.sql.SQLOutput;

public class FirstClass {
    private String firstName;
    private String lastname;
    private String address;
    public FirstClass()
    {
        firstName = "";
        lastname = "";
        address = "";
    }
    public FirstClass(String firstName, String lastname, String address)
    {
        this.firstName = firstName;
        this.lastname = lastname;
        this.address = address;
    }
    public void print()
    {
        System.out.println("Employee -- [ " + "First Name" + firstName + ", last Name: "+lastname+"address: "+address+" ]");
    }
}
