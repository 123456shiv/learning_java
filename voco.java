import java.util.Scanner;
public class voco
{
    public static void main(String[]args)
{
    char ch;
    System.out.println("Enter the character:");
    Scanner sc=new Scanner(System.in);

    ch=sc.next().charAt(0);

    if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
            System.out.println("Invalid input (Not an alphabet)");
        }
        else if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                 ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println("The character is a vowel.");
        }
        else {
            System.out.println("The character is a consonant.");
        }
}
}