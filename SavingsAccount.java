class SavingsAccount extends Account { // Account se inheritance le raha
    private double interestRate = 4.0; // private = sirf isi class me use hoga

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest; // interest jod diya balance me
        System.out.println("Interest added: Rs." + interest);
        System.out.println("New Balance: Rs." + balance);
    }

    @Override
    void withdraw(double amount) {
        // Condition: minimum 1000 rakhna hai account me
        if (balance - amount >= 1000) {
            super.withdraw(amount); // Parent wala withdraw call kar diya
        } else {
            System.out.println("Minimum balance Rs.1000 required");
        }
    }
}