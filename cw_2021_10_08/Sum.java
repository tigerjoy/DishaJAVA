import java.util.Scanner;
class Sum
{
  // Tool
  int sum(int n)
  {
    // Base case
    if(n<=9)
    {
      return n;
    }
    // Recursive Case
    else
    {
      return sum(n/10)+(n%10);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    Sum obj=new Sum();
    // Sum of digits of 17 is 7
    System.out.println("The sum of digits of "+n+" is "+obj.sum(n));
  }
}