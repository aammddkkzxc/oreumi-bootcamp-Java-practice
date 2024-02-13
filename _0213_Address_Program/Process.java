package _0213_Address_Program;

public class Process {
    public static void run() {
        AddressBook addressBook = new AddressBook();
        while(true) {
            Mode mode = Ui.inputMode();
            if (mode == Mode.BUSINESS) {
                addressBook.confirm(Ui.inputBusinessContact());
            }
            if (mode == Mode.PERSONAL) {
                addressBook.confirm(Ui.inputPersonalContact());
            }
            if (mode == Mode.PRINT_ADDRESS) {
                Ui.printAddress(addressBook);
            }
            if (mode == Mode.SEARCH_ADDRESS) {
                Ui.findContact(addressBook);
            }
            if (mode == Mode.QUIT) {
                break;
            }
        }
    }
}
