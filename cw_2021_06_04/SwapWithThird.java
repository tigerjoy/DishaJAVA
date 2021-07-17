import java.util.Scanner;
class SwapWithThird
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    // Before swapping
    // a = 5 b = 3
    System.out.println("Before Swapping");
    System.out.println("a="+a+"b="+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After Swapping");
    System.out.println("a="+a+"b="+b);
  }
}