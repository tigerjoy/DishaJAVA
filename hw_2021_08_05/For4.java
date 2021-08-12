import java.util.Scanner;
class For4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound");
        int lb=sc.nextInt();
        System.out.println("Enter the upper bound");
        int ub=sc.nextInt();
        System.out.println("ASCENDING ORDER");
        for(int i=lb;i<=ub;i++)
        {
            System.out.print(i+" , ");
        }
        System.out.println();
        System.out.println("DESCENDING ORDER");
        for(int j=ub;j>=lb;j--)
        {
            System.out.print(j+" , ");
        }
    }
}