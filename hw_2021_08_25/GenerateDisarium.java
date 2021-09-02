// Scored - 6 points
import java.util.Scanner;
class GenerateDisarium
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
    System.out.println("Enter the lowerbound");
    int lb=sc.nextInt();
    System.out.println("Enter the upperbound");
    int ub=sc.nextInt();
    GenerateDisarium obj=new GenerateDisarium();
    System.out.println("The Disarium numbers are");
    for(int i=lb;i<=ub;i++)
    {
      if(obj.isDisarium(i)==true)
      {
        System.out.print(i+", ");
      }
    }
  }
}