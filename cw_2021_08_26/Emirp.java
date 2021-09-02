/*

ALGORITHM for Emirp Number: 

Step 1. Start
Step 2. Input a number in num
Step 3. If num is prime then go to step 4, otherwise go to step 6
Step 4. Store the reverse of num in rev
Step 5. If rev is prime then, display "num is an Emirp number", 
        otherwise display "num is not an Emirp number", and go to step 7
Step 6. Display "num is not an Emirp number"
Step 7. Stop

*/
import java.util.Scanner;
class Emirp
{
  boolean isPrime(int num)
  {
    int factCount=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        factCount++;
      }
    }
    if(factCount==2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  int reverse(int num)
  {
    int rev=0;
    while(num>0)
    {
      int dig=num%10;
      rev=rev*10+dig;
      num=num/10;
    }
    return rev;
  }
  boolean isEmirp(int num)
  {
    if(isPrime(num)==true)
    {
      int rev=reverse(num);
      if(isPrime(rev)==true)
      {
        return true;
      }
      else
      {
        return false;
      }
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
    int num=sc.nextInt();
    Emirp obj=new Emirp();
    if(obj.isEmirp(num))
    {
      System.out.println(num+" is an Emirp number");
    }
    else
    {
      System.out.println(num+" is not an Emirp number");
    }
  }
}