// Scored - 10 points
import java.util.Scanner;
class GenerateHarshad
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
    boolean isHarshad(int num)
    {
        int sum=sumOfDigits(num);
        if(num%sum==0)
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
        GenerateHarshad obj=new GenerateHarshad();
        System.out.println("The Harshad numbers are");
        for(int i=lb;i<=ub;i++)
        {
            if(obj.isHarshad(i)==true)
            {
                System.out.print(i+", ");
            }
        }
    }
}