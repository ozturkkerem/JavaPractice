package day31;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "AccountHolder='" + accountHolder + '\'' +
                ", AccountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Depositing amount must be greater than zero");
        return;
        }
        balance += amount;
    }
    public void withDraw(double amount){
        if (amount>balance){
            System.out.println("Amount can not be greater than balance");
            return;
        }
        balance -= amount;
    }



}

/*
BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance
	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount
 */