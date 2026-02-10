public class day13b {
    static class BankAccount {
        String owner;
        double balance;

        BankAccount(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println(owner + "deposited R" + amount);
        }
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(owner + " withdrew R" + amount);
            } else {
                System.err.println("Insufficient funds");
            }
        }

        void ShowBalance() {
            System.out.println("Balance: R" + balance);
        }
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Matt", 1000);
            account.deposit(500);
            account.withdraw(300);
            account.ShowBalance();
        }
    }

}
