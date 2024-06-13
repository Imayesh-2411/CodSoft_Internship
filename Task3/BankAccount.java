package Task3;

public class BankAccount {
	private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount){
        if (balance < amount) {
             System.out.println("Insufficient funds");
        }
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
