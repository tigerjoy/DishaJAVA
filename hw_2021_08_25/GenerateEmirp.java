// Scored - 6 points
import java.util.Scanner;
class GenerateEmirp
{
  boolean isPrime(int num)
  {
    int factCount=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        factCount++;
      }
    }
    if(factCount==2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  int reverse(int num)
  {
    int rev=0;
    while(num>0)
    {
      int dig=num%10;
      rev=rev*10+dig;
      num=num/10;
    }
    return rev;
  }
  boolean isEmirp(int num)
  {
    if(isPrime(num)==true)
    {
      int rev=reverse(num);
      if(isPrime(rev)==true)
      {
        return true;
      }
      else
      {
        return false;
      }
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
    GenerateEmirp obj=new GenerateEmirp();
    System.out.println("The Emirp numbers are");
    for(int i=lb;i<=ub;i++)
    {
      if(obj.isPrime(i)==true)
      {
        System.out.print(i+", ");
      }
    }
  }
}