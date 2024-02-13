package _0213_Address_Program;

public enum Mode {
    BUSINESS(1),
    PERSONAL(2),
    PRINT_ADDRESS(3),
    SEARCH_ADDRESS(4),
    QUIT(5),
    NONE(0);

    private final int modeNumber;

    Mode(int modeNumber) {
        this.modeNumber = modeNumber;
    }

    public static Mode decideMode(int chosenMode) {
        Mode[] modes = values();

        for(Mode mode : modes) {
            if(mode.getChooseMenu() == chosenMode) {
                return mode;
            }
        }

        return NONE;
    }

    public void isNone(Mode mode) {
        if(mode == NONE) {
            throw new IllegalArgumentException("정확한 모드 번호를 입력하세요");
        }
    }

    private int getChooseMenu() {
        return modeNumber;
    }
}
