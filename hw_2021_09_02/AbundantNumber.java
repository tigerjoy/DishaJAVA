// Scored - (1/3 * 10) points
import java.util.Scanner;
class AbundantNumber
{
    boolean isAbundant(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num % i == 0)
            {
                sum=sum + i;
            }
        }
        if (sum>num)
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
        AbundantNumber obj=new AbundantNumber();
        if(obj.isAbundant(num)==true)
        {
            System.out.println(num+" is a Abundant number.");
        }
        else
        {
            System.out.println(num+" is not a Abundant number.");
        }
    }
}
