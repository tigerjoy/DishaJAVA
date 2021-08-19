import java.util.Scanner;
class ProductDigit
{
  // Tool
  int productOfDigits(int num)
  {
    int product=1;
    while(num>0)
    {
      int dig=num%10;
      product=product*dig;
      num=num/10;
    }
    return product;
  }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    ProductDigit obj=new ProductDigit();
    System.out.println("The product of digits of the number are: " + obj.productOfDigits(num));
  }
}