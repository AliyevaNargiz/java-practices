public class AccountTest {
    public static void main(String[] args) {
        // Create an account with initial balance
        Account account1 = new Account("123456", "Nargiz Aliyeva", 1000.0);
        System.out.println("Testing Account 1 (created with all fields):");
        account1.displayInfo();
        
        // Create an account without initial balance
        Account account2 = new Account("789012", "Diego Barcenas");
        System.out.println("\nTesting Account 2 (created without initial balance):");
        account2.displayInfo();
        
        // Test deposit
        System.out.println("\nTesting deposit for Account 2:");
        account2.deposit(500.0);
        account2.displayBalance();
        
        // Test withdraw
        System.out.println("\nTesting withdraw for Account 1:");
        double withdrawn = account1.withdraw(200.0);
        System.out.println("Amount withdrawn: $" + withdrawn);
        account1.displayBalance();
        
        // Test insufficient balance
        System.out.println("\nTesting insufficient balance:");
        account2.withdraw(1000.0);
        account2.displayBalance();
        
        // Test getters and setters
        System.out.println("\nTesting getters and setters:");
        account1.setAccountHolder("Nargiz Aliyeva (Updated)");
        System.out.println("Updated Account Holder: " + account1.getAccountHolder());
    }
} 