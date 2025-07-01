public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account("Nargiz", 100);
        System.out.println(acc);
        try {
            acc.withdraw(150); // This will throw exception
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(acc);
    }
}

class Account {
    private String name;
    private double amount;

    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public void withdraw(double amt) {
        if (amt > amount) {
            throw new InvalidAmountException("Withdraw amount exceeds balance");
        }
        amount -= amt;
    }

    public String toString() {
        return "Account[name=" + name + ", amount=" + amount + "]";
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
} 