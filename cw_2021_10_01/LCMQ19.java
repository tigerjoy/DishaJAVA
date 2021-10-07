import java.util.Scanner;
class LCMQ19
{
  int lcm(int num1,int num2)
  {
    int count=1;
    while(count%num1!=0 || count%num2!=0)
    {
      count++;
    }
    return count;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1=sc.nextInt();
    System.out.println("Enter the second number: ");
    int num2=sc.nextInt();
    LCMQ19 obj=new LCMQ19();
    // LCM(6, 12) = 12
    System.out.println("LCM ( "+num1+" , "+num2+" )="+obj.lcm(num1,num2));

  }
}