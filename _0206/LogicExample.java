package _0206;

public class LogicExample {
    public static void main(String[] args) {
        login("blue", "1234");

        try {
            내장_예외_클래스_발생();
        } catch (IllegalArgumentException e) {
            System.out.println("hi");
        }

    }

    public static void login(String id, String password) throws NotExistsIdException, WrongPasswordException{
        if(!id.equals("blue")) {
            throw new NotExistsIdException("아이디가 존재하지 않습니다.");
        }

        if(!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }

    public static void 체크드_예외() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void 내장_예외_클래스_발생() throws IllegalArgumentException{
        throw new IllegalArgumentException();
    }
}
