import java.util.Scanner;
class Disarium
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
  boolean isDisarium(int num)
  {
    int sum=0;
    int temp=num;
    int n=countDigits(num);
    while(num>0)
    {
      int dig=num%10;
      sum=sum+(int)(Math.pow(dig,n));
      n=n-1;
      num=num/10;
    }
    if(sum==temp)
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
    int num=sc.nextInt();
    Disarium obj=new Disarium();
    if(obj.isDisarium(num)==true)
    {
      System.out.println(num+" is a Disarium number.");
    }
    else
    {
      System.out.println(num+" is not a Disarium number.");
    }
  }
}