package C02MethodClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08AccountMain {
    public static void main(String[] args) {
////        계좌개설(객체생성)
////        List를 계좌객체를 담는 자료구조로 사용
//        List<Account> accountList = new ArrayList<>();
//        accountList.add(new Account("hong1", "12345", 1000000));
//        accountList.add(new Account("hong2", "54321", 0));
//
////        계좌1("12345")에서 계좌2("54321")로 송금(50000) : 잔고변경메서드필요
////        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다.
//        for (Account a : accountList){
//            if(a.getAccountNumber().equals("12345")){
////                계좌1의 잔고를 50000감소
//                a.setBalance(a.getBalance()-50000);
//            }
//            if(a.getAccountNumber().equals("54321")){
////                계좌2의 잔고를 50000증가
//                a.setBalance(a.getBalance()+50000);
//            }
//        }
//        System.out.println(accountList);

//        Map을 계좌객체를 담는 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("hong1", "12345", 1000000));
        accountMap.put("54321", new Account("hong2", "54321", 0));

        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");
        a.transfer(b,50000);
        System.out.println(accountMap);



    }
}

//Account클래스 - 계좌주명(name), 계좌번호(accountNumber-String), 잔고(balance-long)
class Account {
//    참조자료형은 초기값 null
    private Long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;
//    원시자료형은 각 자료형에 맞는 초기값

    public Account(String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    //    SetBalance 보다는 의도를 명확히한 메서드명을 사용하기를 권장
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void transfer(Account transgerAccount, long money) {

    }


    @Override
    public String toString() {
        return "{" +
                "id='" + id +'\''+
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

}
