package C04Interface.BankProgram;

//엔티티계층으로서 객체에 대한 상태값을 관리
public class BankAccount {
    private String accountNumber;
    private long balance;

    public BankAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //    최종 금액을 update : 아래 메서드를 통해서 입/출금 모두에 사용.
    public void updateBalance(long balance){
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}