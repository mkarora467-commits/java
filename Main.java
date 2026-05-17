
import java.util.Scanner; // User se input lene ke liye

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input lene ka tool

        System.out.println("=== BANK MANAGEMENT SYSTEM ===");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose account type: ");
        int choice = sc.nextInt();

        sc.nextLine(); // Enter key ka issue fix karta hai
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        Bank account; // Parent class ka reference banaya
        if (choice == 1) {
            account = new SavingsAccount(name, bal); // Savings ka object
        } else {
            account = new CurrentAccount(name, bal); // Current ka object
        }

        while (true) { // Bar bar menu dikhega
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;
                case 3:
                    account.calculateInterest();
                    break;
                case 4:
                    account.displayInfo();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
