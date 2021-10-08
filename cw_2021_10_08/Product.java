import java.util.Scanner;
class Product
{
  // Tool
  int product(int n)
  {
    // Base case
    if(n<=9)
    {
      return n;
    }
    // Recursive Case
    else
    {
      return product (n/10)*(n%10);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    Product obj=new Product();
    // Product of digits of 17 is 7
    System.out.println("The product of digits of "+n+" is "+obj.product(n));
  }
}