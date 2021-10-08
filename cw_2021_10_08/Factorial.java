import java.util.Scanner;
class Factorial
{
  int factorial(int n)
  {
    // Base case
    if(n==1)
    {
      return 1;
    }
    // Recursive Case
    else
    {
      return n*factorial(n-1);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    Factorial obj=new Factorial();
    // 5! = 120
    System.out.println(n+"! = "+obj.factorial(n));
  }
}