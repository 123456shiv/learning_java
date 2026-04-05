import java.util.Scanner;
public class rec
{
    public static void main(String[]args)
{
    int l,b,r;

    System.out.println("Enter the length and breadth:");
    Scanner obj=new Scanner(System.in);

    l=obj.nextInt();
    b=obj.nextInt();

    r=l*b;


    System.out.println("The area of "+l+" and "+b+" is "+r);

    System.out.println("The perimeter of "+l+" and "+b+" is "+2*(l+b));
}
}