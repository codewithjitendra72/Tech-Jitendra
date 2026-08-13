import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] books = { "Java", "HTML", "Python", "C++", "Data Structure", "Hindi", "English" };
        int choice;

        System.out.println("---- Library Menu ----");
        System.out.println("1. Show Books");
        System.out.println("2. Search Book");
        System.out.println("4. Reten Book");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.println("Available Books:");
                for (int i = 0; i < books.length; i++) {
                    System.out.println(books[i]);
                }
                break;

            case 2:
                System.out.print("Enter book name to search: ");
                String name = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < books.length; i++) {
                    if (books[i].equalsIgnoreCase(name)) {
                        System.out.println("Book Found in Library");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book Not Found");
                }
                break;
            case 3:
                System.out.println("Return Book");
                break;

            case 4:
                System.out.println("Exit from Library");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

}