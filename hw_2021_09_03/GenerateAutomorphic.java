import java.util.Scanner;
class GenerateAutomorphic
{
    int countDigits(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }

    boolean isAutomorphic(int num)
    {
        int n=countDigits(num);
        int divisor=(int)Math.pow(10,n);
        int lastDigs=(num*num)%divisor;
        return(lastDigs==num);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lowerbound");
        int lb=sc.nextInt();
        System.out.println("Enter the upperbound");
        int ub=sc.nextInt();
        System.out.println("The Automorphic numbers are");
        GenerateAutomorphic obj=new GenerateAutomorphic();
        for(int i=lb;i<=ub;i++) 
         {
            if(obj.isAutomorphic(i)==true)
            {
                System.out.print(i+", ");
            }
        }
    }
}