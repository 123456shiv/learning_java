import java.util.Scanner;
public class trai

{ 
    public static void main(String[] args)
     {
        int a,b;
        System.out.println("Enter the first side:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the second side:");
        b=sc.nextInt();
        System.out.println("Enter the third side:");
        int c=sc.nextInt();
        if(a==b && b==c)
        {
            System.out.println("The traingle is equalateral:");
        }
        else if(a==b || b==c || a==c)
        {
            System.out.println("The traingle is isosceles:");
        }
        else
        {
            System.out.println("The traingle is scalene:");
        }
    }
}