public class PaymentSystem {
    private double balance = 500.00;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds. Requested: $" + amount + ", Available: $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: $" + balance);
    }
}
