import java.io.*;

public class nestedFunc {

    public static void main(String[] args) {
        int a, b, c;
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter Number 1: ");
            a = Integer.parseInt(din.readLine());
            System.out.print("Enter Number 2: ");
            b = Integer.parseInt(din.readLine());
            System.out.print("Enter Number 3: ");
            c = Integer.parseInt(din.readLine());
            System.out.println("Max number is: " + findMax(a, b, c));
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    private static int max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    private static int findMax(int a, int b, int c) {

        return max(max(a, b), c);
    }
}
