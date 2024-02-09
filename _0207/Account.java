package _0207;

public class Account {
    private long balance;   // 잔액

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long money) {
        balance += money;
    }

    public void withdraw(long money) throws BalanceInsufficientException {
        if (balance < money) {
            throw new BalanceInsufficientException(
                    "잔액부족! 현재 잔액: " + balance + ", 출금하고자 하는 금액: " + money);
        }
        balance -= money;
    }

}