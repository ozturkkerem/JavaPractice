package day31;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Kerem Pasha", 231533242);

        BankAccount bankAccount2 = new BankAccount("Adem", 342343243);

        bankAccount1.deposit(12000);

        bankAccount1.withDraw(100);

        bankAccount2.deposit(1000);

        System.out.println(bankAccount1);

        System.out.println(bankAccount2);


    }
}
