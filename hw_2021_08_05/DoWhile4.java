import java.util.Scanner;
class DoWhile4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound");
        int lb=sc.nextInt();
        System.out.println("Enter the upper bound");
        int ub=sc.nextInt();
        System.out.println("ASCENDING ORDER");
        int i=lb;
        do
        {
            System.out.print(i+" , ");
            i++;
        }
        while(i<=ub);
        System.out.println();
        System.out.println("DESCENDING ORDER");
        int j=ub;
        do
        {
            System.out.print(j+" , ");
            j--;
        }
        while(j>=lb);
    }
}