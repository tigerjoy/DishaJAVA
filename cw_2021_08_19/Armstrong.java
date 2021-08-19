import java.util.Scanner;
class Armstrong
{
  int countDigits(int num)
  {
    int count=0;
    while(num>0)
    {
      count++;
      num/=10;
    }
    return count;
  }
  boolean isArmstrong(int num)
  {
    int sum=0;
    // The original value has to be saved
    int tempNum = num;
    int digits=countDigits(num);
    while(num>0)
    {
      int dig=num%10;
      sum=sum+(int)(Math.pow(dig,digits));
      num/=10;
    }
    if(sum==tempNum)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    Armstrong obj=new Armstrong();
    if(obj.isArmstrong(num)==true)
    {
      System.out.println(num+" is a Armstrong number.");
    }
    else
    {
      System.out.println(num+" is not a Armstrong number.");
    }
  }
}