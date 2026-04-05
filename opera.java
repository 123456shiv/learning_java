import java.util.Scanner;
public class opera
{
    public static void main(String[]args)
{
    int a,b;
    System.out.println("Enter the number:");
    Scanner sc=new Scanner(System.in);
{
    a=sc.nextInt();
    b=sc.nextInt();
    
            System.out.println("The addition of two numbers is: " + (a + b));
            System.out.println("The subtraction of two numbers is: " + (a - b));
            System.out.println("The multiplication of two numbers is: " + (a * b));
            System.out.println("The division of two numbers is: " + (a / b));
            System.out.println("The modulus of two numbers is: " + (a % b));
}
}
}