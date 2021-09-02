// Scored - 4 points
import java.util.Scanner;
class Char1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch=sc.next().charAt(0); // ch = a
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') // <-- 1.
        {
            System.out.println(ch+" is a Letter.");
            if(ch>='A' && ch<='Z')
            {
                System.out.println(ch+" character is in Uppercase.");
            }
            else if(ch>='a' && ch<='z') // <-- 2.
            {
                System.out.println(ch+" character is in Lowercase.");
            }
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println(ch+" is a Digit.");
        }
        else
        {
          System.out.println(ch+" is a Special Symbol.");
        }
    }
}