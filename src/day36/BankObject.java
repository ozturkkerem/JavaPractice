package day36;

public class BankObject {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("kerem ozturk",123442123,10);

        account1.deposit(1000);
        account1.withdraw(1);

        System.out.println(account1.getBalance());

    }
}
