import java.util.Scanner;
class GeneratePrimeQ6
{
  // Tool
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
    if(factCount==2)
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
    GeneratePrimeQ6 obj=new GeneratePrimeQ6();
    System.out.println("The prime numbers are");
    for(int i=lb;i<=ub;i++)
    {
      if(obj.isPrime(i)==true)
      {
        System.out.print(i+", ");
      }
    }
  }
}