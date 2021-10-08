import java.util.Scanner;
class SumNatural
{
  // Tool
  int sumNatural(int n)
  {
    // Base case
    if(n==1)
    {
      return 1;
    }
    // Recursive Case
    else
    {
      return sumNatural(n-1)+n;
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    SumNatural obj=new SumNatural();
    // Sum of natural numbers <= 5 is 15
    System.out.println("Sum of natural numbers <= "+n+" is "+obj.sumNatural(n));
  }
}