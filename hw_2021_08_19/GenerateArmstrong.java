import java.util.Scanner;
class GenerateArmstrong
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
    System.out.println("Enter the lowerbound");
    int lb=sc.nextInt();
    System.out.println("Enter the upperbound");
    int ub=sc.nextInt();
    Armstrong obj=new Armstrong();
    System.out.println("The Armstrong numbers are");
    for(int i=lb;i<=ub;i++)
    {
      if(obj.isArmstrong(i)==true)
      {
        System.out.print(i+", ");
      }
    }
  }
}