import java.util.Scanner;
public class eo
{
    public static void main(String[]args)
{
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    num=sc.nextInt();
    switch(num%2)
    {
        case 1:
        System.out.println("The number is odd");
        break;
        case 2:
        System.out.println("The number is even");
        break;
        default:
        System.out.println("Invalid input");
    }
    }
}