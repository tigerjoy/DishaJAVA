import java.util.Scanner;
class DigitCount
{
  // Tool
  int countDigits(int num)
  {
    int count=0;
    while(num>0)
    {
      count++;
      num=num/10;
    }
    return count;
  }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    DigitCount obj=new DigitCount();
    System.out.println("The number digits of the number are: " + obj.countDigits(num));
  }
}