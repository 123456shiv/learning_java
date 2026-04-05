import java.util.Scanner;
public class vc
{
    public static void main(String[]args)
{
    char ch;
    System.out.println("Enter the character:");
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
    switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println(ch + " is a vowel.");
            break;
        default:
            if ((ch >='a' && ch<='z'))
            {
                System.out.println(ch + " is a consonant.");
            } else {
                System.out.println(ch + " is not an alphabet.");
            }
            sc.close();
    }
}
}