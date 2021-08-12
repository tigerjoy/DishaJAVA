import java.util.Scanner;
class PrimeQ5
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
    System.out.println("Enter a number");
    int num=sc.nextInt();
    PrimeQ5 obj = new PrimeQ5();
    if(obj.isPrime(num)==true)
    {
      System.out.println("It is a Prime Number");
    }
    else
    {
      System.out.println("It is not a Prime Number");
    }
  }
}