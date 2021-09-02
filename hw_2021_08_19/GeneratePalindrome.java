import java.util.Scanner;
class GeneratePalindrome
{
  int reverse(int num)
  {
    int rev=0;
    while(num>0)
    {
      int dig=num%10;
      rev=(rev*10)+dig;
      num=num/10;
    }
    return rev;
  }
  boolean isPalindrome(int num)
  {
    int rev=reverse(num);
    if(rev==num)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the lowerbound");
    int lb=sc.nextInt();
    System.out.println("Enter the upperbound");
    int ub=sc.nextInt();
    GeneratePalindrome obj=new GeneratePalindrome();
    System.out.println("The Palindrome numbers are");
    for(int i=lb;i<=ub;i++)
    {
      if(obj.isPalindrome(i)==true)
      {
        System.out.print(i+", ");
      }
    }
  }
}