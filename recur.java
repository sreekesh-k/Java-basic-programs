import java.io.*;

public class recur {

    public static void main(String[] args) {
        int n;
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter n: ");
            n = Integer.parseInt(din.readLine());
            System.out.println("factorial of " + n + " is " + fact(n));
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    private static int fact(int n) {
        if (n >= 1)
            return n * fact(n - 1);
        else
            return 1;
    }

}
