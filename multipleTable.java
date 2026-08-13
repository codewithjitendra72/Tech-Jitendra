// public class multipleTable{
//  public static void main(String[] args) {
//      for(int i=1;i<=10;i++){
//         System.out.println("Enter the number");
//      }
//      for(int j=1;j<=10;j++){
//         // System.out.println(i+"x"+j+"="+(i*j));
//          System.out.println(i + " x " + j + " = " + (i*j));
//      } 
//  }
// }
import java.util.Scanner;

public class multipleTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}