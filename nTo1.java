import java.io.*;

public class nTo1 {

    public static void main(String[] args) {
        int n;
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter n: ");
            n = Integer.parseInt(din.readLine());
            nToOne(n);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    private static void nToOne(int n) {
        if (n >= 1) {
            nToOne(n - 1);
            System.out.print(n + " ");
            // nToOne(n - 1);
        } else
            return;
    }
}