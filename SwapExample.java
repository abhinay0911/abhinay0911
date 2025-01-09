package Core_Java;

class SwapDemo {
    void swapnumbers() {
        int a = 100, b = 200;
        System.out.println("Before Swap a = " + a + " b = " + b);
        
        // Swap logic using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swap a = " + a + " b = " + b);        
    }
}

public class SwapExample {
    public static void main(String[] args) {
        // Create an object of SwapDemo to call swapnumbers method
        SwapDemo obj = new SwapDemo();
        obj.swapnumbers();  // Calling the swapnumbers method
    }
}
