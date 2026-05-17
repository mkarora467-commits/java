class Account extends Bank { // extends = Inheritance le raha hai Bank se

    Account(String accountHolder, double balance) {
        super(accountHolder, balance); // Parent class ka constructor call kiya
    }

    @Override // Matlab parent ka method apne hisaab se bana rahe
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // balance = balance + amount
            System.out.println("Rs." + amount + " deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // balance = balance - amount
            System.out.println("Rs." + amount + " withdrawn successfully");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for basic account");
    }
}
