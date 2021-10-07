import java.util.Scanner;
class PrimeFactorQ16
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
    if(factCount==2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  void displayPrimeFactors(int num)
  {
    for(int i=1;i<=num;i++)
    {
      if(num%i==0 && isPrime(i))
      {
        System.out.print(i+" , ");
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    PrimeFactorQ16 obj=new PrimeFactorQ16();
    System.out.print("Prime Factors of "+num+" are: ");
    obj.displayPrimeFactors(num);
  }
}