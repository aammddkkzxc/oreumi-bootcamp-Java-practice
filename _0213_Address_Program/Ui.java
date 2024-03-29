package _0213_Address_Program;

import java.util.List;
import java.util.Scanner;

public class Ui {
    private static final String MODE_REQUEST_MESSAGE = """
            1. 비즈니스 연락처 추가
            2. 개인 연락처 추가
            3. 연락처 출력
            4. 연락처 검색
            5. 종료
            메뉴를 선택해주세요 :\40""";

    private static final String NAME_REQUEST_MESSAGE = "이름을 입력하세요 : ";
    private static final String ADDRESS_REQUEST_MESSAGE = "전화번호를 입력하세요 : ";
    private static final String BUSINESS_REQUEST_MESSAGE = "회사명을 입력하세요 : ";
    private static final String PERSONAL_REQUEST_MESSAGE = "관계를 입력하세요 : ";
    private static final String FIND_REQUEST_MESSAGE = "검색할 이름을 입력하세요: ";

    public static Mode inputMode(Scanner scanner) {
        try  {
            Mode chosenMode = chooseMode(scanner);
            chosenMode.isNone(chosenMode);

            return chosenMode;
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");

            return inputMode(scanner);
        }
    }

    public static Mode chooseMode(Scanner scanner) {
        System.out.print(MODE_REQUEST_MESSAGE);
        int modeNumber;

        try {
            modeNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정확한 모드 번호를 입력하세요");
        }

        return Mode.decideMode(modeNumber);
    }

    public static BusinessContact inputBusinessContact(Scanner scanner) {
        System.out.print(NAME_REQUEST_MESSAGE);
        String name = scanner.nextLine();
        System.out.print(ADDRESS_REQUEST_MESSAGE);
        String phoneNumber = scanner.nextLine();
        System.out.print(BUSINESS_REQUEST_MESSAGE);
        String company = scanner.nextLine();

        try {
            return new BusinessContact(name, phoneNumber, company);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputBusinessContact(scanner);
        }
    }

    public static PersonalContact inputPersonalContact(Scanner scanner) {
        System.out.print(NAME_REQUEST_MESSAGE);
        String name = scanner.nextLine();
        System.out.print(ADDRESS_REQUEST_MESSAGE);
        String phoneNumber = scanner.nextLine();
        System.out.print(PERSONAL_REQUEST_MESSAGE);
        String company = scanner.nextLine();

        try {
            return new PersonalContact(name, phoneNumber, company);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputPersonalContact(scanner);
        }
    }

    public static void printAddress(AddressBook addressBook) {
        try {
            addressBook.checkAddressBookEmpty();
            for (Contact contact : addressBook.getContacts()) {
                printer(contact);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findContact(AddressBook addressBook, Scanner scanner) {
        System.out.print(FIND_REQUEST_MESSAGE);
        String name = scanner.nextLine();

        try {
            List<Contact> contactsWithName = addressBook.findContactsWithName(name);
            for(Contact contact : contactsWithName) {
                printer(contact);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printer(Contact contact) {
        System.out.println(contact);
    }
}
