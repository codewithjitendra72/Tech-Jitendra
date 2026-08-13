import java.util.Scanner;
public class factor {
    public static int facto(int x) {
    if(x==1) {
        return 1;
    }
    return x*facto(x-1);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int result = facto(num);
    System.out.println("result" +result);
}
}
