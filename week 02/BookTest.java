public class BookTest {
    public static void main(String[] args) {
        // Test creating a book with title and author
        Book book1 = new Book("Murder on the Orient Express", "Agatha Christie");
        System.out.println("Testing Book 1 (created with title and author):");
        book1.displayInfo();
        
        // Test creating a book with all fields
        Book book2 = new Book("Yuxu", "Chingiz Abdullazade", 19.99);
        System.out.println("\nTesting Book 2 (created with all fields):");
        book2.displayInfo();
        
        // Test getters
        System.out.println("\nTesting getters for Book 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: $" + book2.getPrice());
        
        // Test setters
        System.out.println("\nTesting setters for Book 1:");
        book1.setTitle("Murder on the Orient Express (Updated)");
        book1.setAuthor("Agatha Christie (Updated)");
        book1.setPrice(24.99);
        book1.displayInfo();
    }
} 