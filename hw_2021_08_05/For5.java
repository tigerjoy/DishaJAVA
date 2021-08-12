import java.util.Scanner;
class For5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound");
        int lb=sc.nextInt();
        System.out.println("Enter the upper bound");
        int ub=sc.nextInt();
        System.out.println("ODD NUMBERS");
        for(int i=lb;i<=ub;i=i+2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("EVEN NUMBERS");
        for(int j=lb+1;j<=ub-1;j=j+2)
        {
            System.out.print(j+" ");
        }
    }
}