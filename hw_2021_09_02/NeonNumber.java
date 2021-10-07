// Scored - 5 points
import java.util.Scanner;
class NeonNumber
{
    int sumOfDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            int dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        return sum;
    }
    // Wrong logic
    boolean isNeon(int num)
    {
        int sum=sumOfDigits(num*num);
        if(num==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        NeonNumber obj=new NeonNumber();
        if(obj.isNeon(num)==true)
        {
            System.out.println(num+" is a Neon number.");
        }
        else
        {
            System.out.println(num+" is not a Neon number.");
        }
    }
}