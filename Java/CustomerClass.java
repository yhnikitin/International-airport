package Project;

public class CustomerClass {
    private String name;
    private String birthDate;
    private String address;

    public CustomerClass(String name, String address, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getName() { return name; }
    public String getBirthDate() { return birthDate; }
    public String getAddress() { return address; }
}
