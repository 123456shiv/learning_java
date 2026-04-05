import java.util.Scanner;

public class menu{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        // Menu display
        System.out.println("Menu:");
        System.out.println("1. Tea");
        System.out.println("2. Coffee");
        System.out.println("3. Juice");

        System.out.print("Enter your choice (1-3): ");
        choice = sc.nextInt();

        // Switch case
        switch(choice) {
            case 1:
                System.out.println("You selected Tea");
                break;

            case 2:
                System.out.println("You selected Coffee");
                break;

            case 3:
                System.out.println("You selected Juice");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}