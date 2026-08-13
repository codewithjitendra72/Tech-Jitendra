import java.util.Scanner;

public class addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the farst number");
        int num1 = sc.nextInt();
        System.out.println("Enter the secan number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("sum" + sum);
    }
}