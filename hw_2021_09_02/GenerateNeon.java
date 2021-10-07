// Scored - 5 points
import java.util.Scanner;
class GenerateNeon
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
        System.out.println("Enter the lowerbound");
        int lb=sc.nextInt();
        System.out.println("Enter the upperbound");
        int ub=sc.nextInt();
        GenerateNeon obj=new GenerateNeon();
        System.out.println("The Neon numbers are: ");
        for(int i=lb;i<=ub;i++)
        {
            if(obj.isNeon(i)==true)
            {
                System.out.print(i+" , ");
            }
        }
    }
}