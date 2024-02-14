package _0213_Address_Program;

import java.util.Objects;
import java.util.regex.Pattern;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        checkRegex(phoneNumber);
        //각종 유효성 검사 로직 구현
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private void checkRegex(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
        if(!pattern.matcher(phoneNumber).find()) {
            throw new IllegalArgumentException("번호 형식에 맞게 다시 입력해 주세요");
        }
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
