import java.util.Scanner;
class DisplayDigits
{
  // Tool
  void displayDigits(int n)
  {
    // Base case
    if(n<=9)
    {
      System.out.println(n);
    }
    // Recursive Case
    else
    {
      System.out.println(n%10);
      displayDigits(n/10);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    DisplayDigits obj=new DisplayDigits();
    System.out.println("The digits of "+n+" are ");
    obj.displayDigits(n);
  }
}