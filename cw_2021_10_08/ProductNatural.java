import java.util.Scanner;
class ProductNatural
{
  // Tool
  int productNatural(int n)
  {
    // Base case
    if(n==1)
    {
      return 1;
    }
    // Recursive Case
    else
    {
      return productNatural(n-1)*n;
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    ProductNatural obj=new ProductNatural();
    // Product of natural numbers <= 5 is 15
    System.out.println("Product of natural numbers <= "+n+" is "+obj.productNatural(n));
  }
}