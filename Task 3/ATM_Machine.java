import java.util.Scanner;

public class ATM_Machine {
    private Account Account;

    public ATM_Machine(Account Account) {
        this.Account = Account;
    }

    public void userInterface() {
        System.out.println("Options:");
        System.out.println("1. Check Balance \n2. Deposit \n3. Withdraw \n4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + Account.getBalance());
    }

    public void deposit(double amount) {
        Account.deposit(amount);
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + Account.getBalance());
    }

    public void withdraw(double amount) {
        if (Account.withdraw(amount)) {
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + Account.getBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        Account Account = new Account(1000.0);
        ATM_Machine atm = new ATM_Machine(Account);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            atm.userInterface();
            System.out.print("Enter your choice (1-4): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Exiting the ATM. Have a nice day!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}