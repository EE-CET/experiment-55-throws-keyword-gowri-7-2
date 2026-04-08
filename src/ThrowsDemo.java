import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo {
    
    // Define static method check(int n) that throws IOException
    static void check(int n) throws IOException {
        if (n < 0) {
            throw new IOException();
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n
        int n = sc.nextInt();
        
        // try-catch block
        try {
            check(n);
        } catch (IOException e) {
            System.out.println("Caught: IO Exception");
        }
    }
}
