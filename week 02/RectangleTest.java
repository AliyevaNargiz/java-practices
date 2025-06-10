public class RectangleTest {
    public static void main(String[] args) {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        
        // Test getters
        System.out.println("Initial rectangle dimensions:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        
        // Test area and perimeter
        System.out.println("\nCalculations:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        
        // Test setters
        System.out.println("\nAfter updating dimensions:");
        rectangle.setLength(6.0);
        rectangle.setWidth(4.0);
        System.out.println("New Length: " + rectangle.getLength());
        System.out.println("New Width: " + rectangle.getWidth());
        System.out.println("New Area: " + rectangle.getArea());
        System.out.println("New Perimeter: " + rectangle.getPerimeter());
    }
} 