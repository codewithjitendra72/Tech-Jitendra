import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fist number");
        a = sc.nextInt();
        System.out.print("Enter the secand number");
        b = sc.nextInt();

        sum = a + b;
        System.out.println("Sum =" + sum);
    }
}
