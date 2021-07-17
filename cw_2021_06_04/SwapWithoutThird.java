import java.util.Scanner;
class SwapWithoutThird
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
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After Swapping");
    System.out.println("a="+a+"b="+b);
  }
}