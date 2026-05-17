
class CurrentAccount extends Account {
    private double overdraftLimit = 5000; // 5000 tak udhaar le sakte ho

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }

    @Override
    void withdraw(double amount) {
        // balance + 5000 tak nikal sakte ho
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully");
            if (balance < 0) {
                System.out.println("Overdraft used: Rs." + (-balance));
            }
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}