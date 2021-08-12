import java.util.Scanner;
class DoWhile5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound");
        int lb=sc.nextInt();
        System.out.println("Enter the upper bound");
        int ub=sc.nextInt();
        System.out.println("ODD NUMBER");
        int i=lb;
        do
        {
            System.out.print(i+" , ");
            i=i+2;
        }
        while(i<=ub);
        System.out.println();
        System.out.println("EVEN NUMBER");
        int j=lb+1;
        do
        {
            System.out.print(j+" , ");
            j=j+2;
        }
        while(j<=ub-1);
    }
}