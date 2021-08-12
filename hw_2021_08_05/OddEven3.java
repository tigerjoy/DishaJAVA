import java.util.Scanner;
class OddEven3
{
  public static void main(String args[])
  {
    System.out.println("To print odd numbers");
    int i=1;
    do
    {
      System.out.println(i);
      i=i+2;
    }
    while(i<=10);
    System.out.println("To print even numbers");
    int j=2;
    do
    {
      System.out.println(j);
      j=j+2;
    }
    while(j<=10);
  }
}