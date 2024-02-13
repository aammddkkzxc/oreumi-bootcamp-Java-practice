package _0213_Address_Program;

import java.util.Objects;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isNumberDuplicate(Contact other) {
        return Objects.equals(this.getPhoneNumber(), other.getPhoneNumber());
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
