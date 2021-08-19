import java.util.Scanner;
class Palindrome
{
  // Tool
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
    // Alternate
    // if(reverse(num) == num)
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
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    Palindrome obj=new Palindrome();
    // 515 is a palindrome
    if(obj.isPalindrome(num)==true)
    {
      System.out.println(num+" is a palindrome number.");
    }
    else
    {
      System.out.println(num+" is not a palindrome number.");
    }
  }
}