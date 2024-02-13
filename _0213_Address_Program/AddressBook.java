package _0213_Address_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {
    private final List<Contact> contacts = new ArrayList<>();

    public void confirm(Contact contact) {
        try {
            register(contact);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            removeDuplicatedContact();
        }
    }

    private void register(Contact contact) {
        contacts.add(contact);
        validateDuplicate();
    }

    private void validateDuplicate() {
        for (int i = 0; i < contacts.size() - 1; i++) {
            for (int j = i + 1; j < contacts.size(); j++) {
                if (contacts.get(i).isNumberDuplicate(contacts.get(j))) {
                    throw new IllegalArgumentException("중복된 번호가 존재합니다. 다시 입력해 주세요");
                }
            }
        }
    }

    private void removeDuplicatedContact() {
        contacts.remove(contacts.size() - 1);
    }

    public List<Contact> findContactsWithName(String name) {
        List<Contact> contactsWithName = new ArrayList<>();

        for (Contact contact : contacts) {
            if (contact.isContactExist(name)) {
                contactsWithName.add(contact);
            }
        }

        if(contactsWithName.size() == 0) {
            throw new IllegalArgumentException("연락처를 찾을 수 없습니다.");
        }

        return contactsWithName;
    }

    public List<Contact> getContacts() {
        return Collections.unmodifiableList(contacts);
    }
}
