class Demo012 {
    // Method to calculate the area of a circle
    void Area() {
        int r = 5; // radius of the circle
        double ca = Math.PI * Math.pow(r, 2); // Formula for the area of a circle
        System.out.println("The circle area is: " + ca);
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Instantiate the Demo012 class to call the Area method
        Demo012 obj = new Demo012();
        obj.Area(); // Call the method to calculate and display the area
    }
}
