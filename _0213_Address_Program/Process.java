package _0213_Address_Program;

import java.util.Scanner;

public class Process {
    public static void run() {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Mode mode = Ui.inputMode(scanner);
            if (mode == Mode.BUSINESS) {
                addressBook.confirm(Ui.inputBusinessContact(scanner));
            }
            if (mode == Mode.PERSONAL) {
                addressBook.confirm(Ui.inputPersonalContact(scanner));
            }
            if (mode == Mode.PRINT_ADDRESS) {
                Ui.printAddress(addressBook);
            }
            if (mode == Mode.SEARCH_ADDRESS) {
                Ui.findContact(addressBook, scanner);
            }
            if (mode == Mode.QUIT) {
                break;
            }
        }
    }
}
