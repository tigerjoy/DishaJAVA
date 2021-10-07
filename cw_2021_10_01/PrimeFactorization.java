import java.util.Scanner;
class PrimeFactorization
{
  // Tool
  void primeFactorization(int num)
  {
    int currFact=2;
    while(num!=1)
    {
      if(num%currFact==0)
      {
        num=num/currFact;
        System.out.print(currFact+" , ");
      }
      else
      {
        currFact++;
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    PrimeFactorization obj=new PrimeFactorization();
    System.out.print("Prime Factorization of "+num+" gives: ");
    obj.primeFactorization(num);
  }
}