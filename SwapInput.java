import java.util.Scanner;

public class SwapInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fast numbar");
        int a = sc.nextInt();
        System.out.println("Enter secand number");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping" + a + "" + b);

    }
}
