abstract class Bank {
    protected String accountHolder; // Naam store karne ke liye
    protected double balance; // Paise store karne ke liye

    Bank(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void deposit(double amount); // Paise jama karne ka method

    abstract void withdraw(double amount); // Paise nikalne ka method

    abstract void calculateInterest(); // Interest ka method

    public double getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}