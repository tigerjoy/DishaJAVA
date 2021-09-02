// Scored - 6 points
import java.util.Scanner;
class KrishnaMurthy
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
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        KrishnaMurthy obj=new KrishnaMurthy();
        if(obj.isKrishnaMurthy(num)==true)
        {
            System.out.println(num+" is a KrishnaMurthy number.");
        }
        else
        {
            System.out.println(num+" is not a KrishnaMurthy number.");
        }
    }
}
