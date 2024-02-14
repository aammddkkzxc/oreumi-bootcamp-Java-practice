package _0213_Address_Program;

import java.util.Objects;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        //각종 유효성 검사 로직 구현
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isNumberDuplicate(Contact other) {
        return Objects.equals(this.getPhoneNumber(), other.getPhoneNumber());
    }

    public boolean isContactExist(String name) {
        return Objects.equals(this.name, name);
    }

    @Override
    public String toString() {
        return String.format("이름 : %s, 전화번호 : %s, ", name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
