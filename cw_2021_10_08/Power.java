import java.util.Scanner;
class Power
{
  // Tool
  int power(int a, int b)
  {
    // Base case
    if(b==0)
    {
      return 1;
    }
    // Recursive Case
    else
    {
      return a*power(a,b-1);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base value: ");
    int a=sc.nextInt();
    System.out.println("Enter the exponential value: ");
    int b=sc.nextInt();
    Power obj=new Power();
    // 2^4 = 16
    System.out.println(a+"^"+b+" = "+obj.power(a,b));
  }
}