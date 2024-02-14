package _0213_Address_Program;

public class PersonalContact extends Contact{
    private final String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        //각종 유효성 검사 로직 구현
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "관계 : %s", relationship);
    }

    public String getRelationship() {
        return relationship;
    }
}
