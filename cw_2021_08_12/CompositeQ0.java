import java.util.Scanner;
class CompositeQ0
{
  // Tool
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
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    CompositeQ0 obj = new CompositeQ0();
    // boolean result = obj.isComposite(num);
    // if(result==true)
    if(obj.isComposite(num)==true)
    {
      System.out.println("It is a Composite Number");
    }
    else
    {
      System.out.println("It is not a Composite Number");
    }
  }
}