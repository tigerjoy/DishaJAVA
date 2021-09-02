import java.util.Scanner;
class GeneratePerfect
{
  boolean isPerfect(int num)
  {
    int sum=0;
    for(int i=1;i<num;i++)
    {
      if(num % i == 0)
      {
          sum=sum + i;
      }
    }
    if (sum==num)
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
      GeneratePerfect obj=new GeneratePerfect();
      System.out.println("The perfect numbers are");
      for(int j=lb;j<=ub;j++)
      {
        if(obj.isPerfect(j)==true)
        {
          System.out.print(j+", ");
        }
      }
}
}
