import java.util.Scanner;
public class grade
{
    public static void main(String[] args) 
    {
    int a;
    System.out.println("Enter the grade:");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    if(a>=90)
    {
        System.out.println("Grade A:");
    }
    else if(a>=80)
    {
        System.out.println("Grade B:");
    }
    else if(a>=70)
    {
        System.out.println("Grade C:");
    }
    else if(a>=60)
    {
        System.out.println("Grade D:");
    }
    else
    {
        System.out.println("Grade F:");
    }

    }
}