// Scored - (1/3 * 10) points
import java.util.Scanner;
class PerfectNumber
{
    boolean isPerfect(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num % i == 0)
            {
                sum=sum + i;
            }
        }
        if (sum==num)
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
        PerfectNumber obj=new PerfectNumber();
        if(obj.isPerfect(num)==true)
        {
            System.out.println(num+" is a Perfect number.");
        }
        else
        {
            System.out.println(num+" is not a Perfect number.");
        }
    }
}
