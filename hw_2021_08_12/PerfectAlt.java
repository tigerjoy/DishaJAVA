import java.util.Scanner;
class PerfectAlt
{
    int sumOfFactors(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    boolean isPerfect(int num)
    {
        if(num==sumOfFactors(num))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = s.nextInt();
        PerfectAlt obj=new PerfectAlt();
        if(obj.isPerfect(num)==true)
        {
            System.out.println("The number is Perfect");
        }
        else
        {
            System.out.println("The number is not Perfect");
        }    
    }
}

