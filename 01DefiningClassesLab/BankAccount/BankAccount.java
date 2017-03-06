package BankAccount;

public class BankAccount {

    private int id;

    private double balance;

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit (double amount){
        if (amount <0){
            amount = 0;
        }
        this.balance += amount;
    }

    public void withdraw (double amount) {
        if (amount > this.balance){
            System.out.println("Insufficient balance");
        }else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return String.format("Account ID%s, balance %.2f", this.id, this.balance);
    }
}
