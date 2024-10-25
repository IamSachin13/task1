public class Account {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(500);


        account1.displayBalance();
        account1.deposit(200);
        account1.withdraw(100);
        account1.displayBalance();


    }


    private double balance;


    public Account() {
        this.balance = 0.0;
    }


    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }



}
