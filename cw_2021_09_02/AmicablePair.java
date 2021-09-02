import java.util.Scanner;
class AmicablePair
{
  int sumOfFactors(int num)
  {
    int sum=0;
    for(int i=1;i<=num/2;i++)
    {
      if(num%i==0)
      {
        sum=sum+i;
      }
    }
    return sum;
  }
  boolean isAmicable(int num1, int num2)
  {
    // if(num1 != num2 && s1 == num2 && s2 == num1)
    // if(num1!=num2 && sumOfFactors(num1)==num2 && sumOfFactors(num2)==num1)
    // {
    //   return true;
    // }
    // else
    // {
    //   return false;
    // }
    return (num1!=num2 && 
            sumOfFactors(num1)==num2 && 
            sumOfFactors(num2)==num1);
    
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1=sc.nextInt();
    System.out.println("Enter second number: ");
    int num2=sc.nextInt();
    AmicablePair obj=new AmicablePair();
    // (220, 284) forms an amicable pair
    if(obj.isAmicable(num1,num2))
    {
      System.out.println("("+num1+", "+num2+") forms an amicable pair ");
    }
    else
    {
      System.out.println("("+num1+", "+num2+") does not form an amicable pair ");
    }
  }
}