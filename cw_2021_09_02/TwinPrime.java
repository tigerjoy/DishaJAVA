import java.util.Scanner;
class TwinPrime
{
  boolean isPrime(int num)
  {
    int factCount=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        factCount++;
      }
    }
    return(factCount==2);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the lowerbound: ");
    int lb=sc.nextInt();
    System.out.println("Enter the Upperrbound: ");
    int ub=sc.nextInt();
    TwinPrime obj=new TwinPrime();
    // (3, 5); (5, 7);
    System.out.println("THE TWIN PRIME NUMBERS BETWEEN " +lb+" AND "+ub+" ARE ");
    for(int i=lb;i<=ub-2;i++)
    {
      if(obj.isPrime(i) && obj.isPrime(i+2))
      {
        System.out.print("("+i+", "+(i+2)+");");
      }
    }
    System.out.println();
  }
}