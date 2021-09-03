import java.util.Scanner;
class HCF
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
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1=sc.nextInt();
    System.out.println("Enter the second number: ");
    int num2=sc.nextInt();
    HCF obj=new HCF();
    // HCF(18, 16) = 2
    System.out.println("HCF ("+num1+","+num2+") = "+obj.hcf(num1,num2));
	}
}