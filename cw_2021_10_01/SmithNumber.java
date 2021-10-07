import java.util.Scanner;
class SmithNumber
{
  boolean isComposite(int num)
  {
    int factCount=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        factCount++;
      }
    }
    if(factCount>2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
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
  int sumOfPrimeFactorization(int num)
  {
    int sum=0;
    int currFact=2;
    while(num!=1)
    {
      if(num%currFact==0)
      {
        num=num/currFact;
        sum=sum+sumOfDigits(currFact);
      }
      else
      {
        currFact++;
      }
    }
    return sum;
  }
  // C1 = true && C2 = true -> true
  boolean isSmith(int num)
  {
    if(isComposite(num) && 
       (sumOfDigits(num) == 
       sumOfPrimeFactorization(num))) 
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
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    SmithNumber obj=new SmithNumber();
    if(obj.isSmith(num))
    {
      System.out.println(num+" is a Smith number");
    }
    else
    {
      System.out.println(num+" is not a Smith number");
    }
  }
}