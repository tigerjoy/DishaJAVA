import java.util.Scanner;
public class GenerateNPrime
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
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of n: ");
	    int n = sc.nextInt(); // 10
	    GenerateNPrime obj = new GenerateNPrime();
      int generatedNum = 2;
	    while(n != 0)
	    {
	        if(obj.isPrime(generatedNum))
          {
            System.out.print(generatedNum + ", ");
            n--;
          }
          generatedNum++;
	    }
	}
	
}
