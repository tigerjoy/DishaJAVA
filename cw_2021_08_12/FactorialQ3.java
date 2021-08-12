import java.util.Scanner;
class FactorialQ3
{
  // Tool
  int factorial(int num)
  {
    int fact=1;
    for(int i=num;i>=1;i--)
    {
      fact=fact*i;
      // fact*=i;
    }
    return fact;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    FactorialQ3 obj=new FactorialQ3();
    // int fact = obj.factorial(num);
    // The factorial of 5 is 120
    // System.out.println("The factorial of "+num+ " is "+fact+".");
    System.out.println("The factorial of "+num+ " is "+obj.factorial(num)+".");
  }
}