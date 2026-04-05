import java.util.Scanner;

public class cal {
    public static void main(String[] args) {

        int a, b;
        char op;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /):");
        op = sc.next().charAt(0);

        switch(op)
        {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                if(b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}