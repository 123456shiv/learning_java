import java.util.Scanner;
public class subu
{
    public static void main(String[]args)
{
    int a,b,c;
    System.out.println("Enter the value:");
    Scanner obj=new Scanner(System.in);

    a=obj.nextInt();
    b=obj.nextInt();
    c=a-b;

    System.out.println("The subtraction of "+a+" and "+b+" is "+c);
}

}