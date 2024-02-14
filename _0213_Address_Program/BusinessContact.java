package _0213_Address_Program;

public class BusinessContact extends Contact{
    private final String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        //각종 유효성 검사 로직 구현
        this.company = company;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "회사명 : %s", company);
    }

    public String getCompany() {
        return company;
    }
}
