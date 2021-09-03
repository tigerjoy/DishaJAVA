import java.util.Scanner;
class Automorphic
{
  int countDigits(int num)
  {
    int count=0;
    while(num!=0)
    {
      count++;
      num/=10;
    }
    return count;
  }
  boolean isAutomorphic(int num)
  {
    int n=countDigits(num);
    int divisor=(int)Math.pow(10,n);
    int lastDigs=(num*num)%divisor;
    return(lastDigs==num);
  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    Automorphic obj=new Automorphic();
    if(obj.isAutomorphic(num))
    {
      System.out.println(num+" is an Automorphic Number");
    }
    else
    {
      System.out.println(num+" is not an Automorphic Number");
    }
	}
}