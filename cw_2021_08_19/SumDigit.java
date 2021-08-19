import java.util.Scanner;
class SumDigit
{
  // Tool
  int sumOfDigits(int num)
  {
    int sum=0;
    while(num>0)
    {
      int dig=num%10;
      sum=sum+dig;
      num=num/10;
    }
    return sum;
  }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    SumDigit obj=new SumDigit();
    System.out.println("The sum of digits of the number are: " + obj.sumOfDigits(num));
  }
}