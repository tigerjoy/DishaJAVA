import java.util.Scanner;
class LCMV1
{
  int hcf(int num1, int num2)
  {
    int dividend=num2;
    int divisor=num1;
    int rem=dividend%divisor;
    while(rem!=0)
    {
      dividend=divisor;
      divisor=rem;
      rem=dividend%divisor;
    }
    return divisor;
  }
  int lcm(int num1, int num2)
  {
    return (num1*num2)/hcf(num1,num2);
  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1=sc.nextInt();
    System.out.println("Enter the second number: ");
    int num2=sc.nextInt();
    LCMV1 obj=new LCMV1();
    // LCM(18, 16) = 2
    System.out.println("LCM ("+num1+","+num2+") = "+obj.lcm(num1,num2));
	}
}