import java.util.Scanner;
class Positive
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);  
    System.out.println("Enter A Number: ");
    int num=sc.nextInt();
    if(num>0)
    {
      System.out.println("The number is Positive");
    }
    else if(num<0)
    {
      System.out.println("The number is Negative");
    }
    else
    {
      System.out.println("The number is zero");
    }
  }
}