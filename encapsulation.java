class Account {
    private double balance; // private = can't access directly

    // Getter
    public double getBalance() {
        return balance;
    }
    // Setter
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
        } else {
            this.balance = balance; // 'this' refers to the current object's balance
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setBalance(1000);           // ✅ setting value safely
        System.out.println(acc.getBalance()); // ✅ reading value safely

        acc.setBalance(-500);           // ❌ error message shown
    }
}