public class callByRef {
    public static void main(String[] arg) {
        number a = new number();
        a.value = 36;
        System.out.println("value of a: " + a.value);
        root(a);
        System.out.println("value of a: " + a.value);
    }

    private static void root(number a) {
        a.value = Math.sqrt(a.value);
    }
}

class number {
    double value;
}