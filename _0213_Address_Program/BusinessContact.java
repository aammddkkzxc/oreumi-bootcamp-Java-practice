package _0213_Address_Program;

public class BusinessContact extends Contact{
    private final String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}
