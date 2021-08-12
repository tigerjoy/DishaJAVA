import java.util.Scanner;
class PowerQ4
{
  // Tool
  int power(int a,int b)
  {
    // pow, i are local variables
    int pow=1;
    for(int i=1;i<=b;i++)
    {
      pow=pow*a;
    }
    return pow;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base: ");
    int a=sc.nextInt();
    System.out.println("Enter the index: ");
    int b=sc.nextInt();
    PowerQ4 obj=new PowerQ4();
    int pow = obj.power(a,b);
    // 2 ^ 3 = 8
    System.out.println(a+" ^ "+b+" = "+pow);
  }
}