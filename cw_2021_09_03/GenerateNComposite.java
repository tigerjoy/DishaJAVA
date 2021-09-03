import java.util.Scanner;
class GenerateNComposite
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
    return(factCount>2);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("How many composite numbers do you want to generate ?");
    int n=sc.nextInt();
    GenerateNComposite obj=new GenerateNComposite();
    int num=4;
    while(n!=0)
    {
      if(obj.isComposite(num))
      {
        System.out.print(num+" , ");
        n--;
      }
      num++;
    }
    System.out.println();
  }
}