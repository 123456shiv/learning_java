import java.util.Scanner;
public class calcu
{
public static void main(String[]args)
{
    int a,b,c;

    System.out.println("Enter the value:");
    Scanner obj=new Scanner(System.in);

    a=obj.nextInt();
    b=obj.nextInt();

    c=a+b;
    c=a-b;
    c=a*b;
    c=a/b;

System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
System.out.println("The product of " + a + " and " + b + " is " + (a * b));
System.out.println("The division of " + a + " and " + b + " is " + (a / b));

}

}