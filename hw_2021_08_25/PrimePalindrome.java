// Scored - 5.5 points
import java.util.Scanner;
class PrimePalindrome
{
    boolean isPrime(int num)
    {
        int factCount=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                factCount++;
            }
        }
        if(factCount==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            int dig=num%10;
            rev=(rev*10)+dig;
            num=num/10;
        }
        return rev;
    }
    boolean isPalindrome(int num)
    {
        int rev=reverse(num);
        if(rev==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isPrimePalindrome(int num)
    {
        // num = 101
        // if(true && true)
        // if(true)
        // condition = true, return true
        // condition = false, return false
        // return condition
        // if(isPrime(num) && isPalindrome(num))
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        return (isPrime(num) && isPalindrome(num));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int m=sc.nextInt();
        System.out.println("Enter the second integer: ");
        int n=sc.nextInt();
        if(m<n && m<3000 && n<3000)
        {
            PrimePalindrome obj=new PrimePalindrome();
            System.out.println("The Prime Palindrome Numbers are: ");
            for(int i=m;i<=n;i++)
            {
                
                // obj.isPrimePalindrome(i) -> boolean
                // i = 101
                // obj.isPrimePalindrome(i) -> true
                // if(true == true)
                // if(obj.isPrimePalindrome(i)==true)
                // if(true)
                if(obj.isPrimePalindrome(i))
                {
                    System.out.print(i+", ");
                }
            }
        }
        else
        {
          System.out.println("OUT OF RANGE");
        }
    }
    }