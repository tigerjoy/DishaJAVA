import java.util.Scanner;
class DisplayDigitsForward
{
  // Tool
  void displayDigitsForward(int n)
  {
    // Base case
    if(n<=9)
    {
      System.out.println(n);
    }
    // Recursive Case
    else
    {
      displayDigitsForward(n/10);
      System.out.println(n%10);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    DisplayDigitsForward obj=new DisplayDigitsForward();
    System.out.println("The digits of "+n+" are ");
    obj.displayDigitsForward(n);
  }
}