import java.util.Scanner;
class Digit
{
  // Tool
  void displayDigits(int num)
  {
    while(num>0)
    {
      int dig=num%10;
      System.out.print(dig+" , ");
      num=num/10;
    }
  }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    Digit obj=new Digit();
    System.out.println("The digits of the number are: ");
    obj.displayDigits(num);
  }
}