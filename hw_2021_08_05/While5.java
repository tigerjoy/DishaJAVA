import java.util.Scanner;
class While5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound");
        int lb=sc.nextInt();
        System.out.println("Enter the upper bound");
        int ub=sc.nextInt();
        System.out.println("ODD NUMBERS");
        int i=lb;
        while(i<=ub)
        {
            System.out.print(i+"  ");
            i=i+2;
        }
        System.out.println();
        System.out.println("EVEN NUMBERS");
        int j=lb+1;
        while(j<=ub-1)
        {
            System.out.print(j+"  ");
            j=j+2;
        }
    }
}