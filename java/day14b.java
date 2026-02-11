public class day14b {
    // this is the class for bank account
    static class BankAccount {
        private String owner;
        private double balance;

        BankAccount(String owner, double balance) {
            this.owner = owner;
            if (balance >= 0) {
                this.balance = balance;
            } else {
                this.balance = 0;
            }

        }

        public String getOwener() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount; // 1.2.
            } else {
                System.err.println("Invalid amount!");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds!");
            }
        }

    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", 1000);
        acc.deposit(500); // 2.
        acc.withdraw(300);
        System.err.println("Owner: " +acc.getOwener());
        System.out.println("Balance: " + acc.getBalance());


    }
}