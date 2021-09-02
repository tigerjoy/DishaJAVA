// Scored - 6 points
import java.util.Scanner;
class GenerateKrishnaMurthy
{
    int factorial(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }

    boolean isKrishnaMurthy(int num)
    {
        int sum=0;
        int temp=num;
        while(num>0)
        {
            sum=sum+factorial(num%10);
            num=num/10;
        }
        if(sum==temp)
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
        GenerateKrishnaMurthy obj=new GenerateKrishnaMurthy();
        System.out.println("The KrishnaMurthy numbers are");
        for(int i=lb;i<=ub;i++)
        {
            if(obj.isKrishnaMurthy(i)==true)
            {
                System.out.print(i+", ");
            }
        }
    }
}
