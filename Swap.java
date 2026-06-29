public class Swap {
    public static void main(String[] args) {
        int a = 20, b = 40;
        System.out.println("Befor swaping" + a + "" + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping" + a + "" + b);
    }

}
