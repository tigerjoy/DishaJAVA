import java.util.Scanner;
class Perfect
{
  boolean isPerfect(int num)
  {
    int sum=0;
    for(int i=1;i<=num/2;i++)
    {
      if(num%i==0)
      {
        sum=sum+i;
      }
    }
    if(sum==num)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = s.nextInt();
        Perfect obj=new Perfect();
        if(obj.isPerfect(num)==true)
        {
            System.out.println("The number is Perfect");
        }
        else
        {
            System.out.println("The number is not Perfect");
        }    
    }
}


