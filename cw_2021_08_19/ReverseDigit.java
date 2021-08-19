import java.util.Scanner;
class ReverseDigit
{
  // Tool
  int reverse(int num)
  {
    int rev=0;
    while(num>0)
    {
      int dig=num%10;
      rev=(rev*10)+dig;
      num=num/10;
    }
    return rev;
  }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    ReverseDigit obj=new ReverseDigit();
    System.out.println("The reverse of number is: " + obj.reverse(num));
  }
}