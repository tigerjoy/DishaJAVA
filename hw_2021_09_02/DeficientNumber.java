// Scored - (1/3 * 10) points
import java.util.Scanner;
class DeficientNumber
{
    boolean isDeficient(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num % i == 0)
            {
                sum=sum + i;
            }
        }
        if (sum<num)
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
        DeficientNumber obj=new DeficientNumber();
        if(obj.isDeficient(num)==true)
        {
            System.out.println(num+" is a Deficient number.");
        }
        else
        {
            System.out.println(num+" is not a Deficient number.");
        }
    }
}
