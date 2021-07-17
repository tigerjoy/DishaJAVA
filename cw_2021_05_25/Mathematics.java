import java.util.Scanner;
class Mathematics
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first value: ");
    int num1=sc.nextInt();
    System.out.print("Enter the second value: ");
    int num2=sc.nextInt();
    // 5 / 2 = 2.5    
    System.out.println(num1+ " / " +num2+" = "+((double)(num1)/num2));
    System.out.println(num1+ " + "+num2+" = "+(num1+num2));
    System.out.println(num1+" - "+num2+" = "+(num1-num2));
    System.out.println(num1+" * "+num2+" = "+(num1*num2));
    System.out.println(num1+" // "+num2+" = "+(num1/num2));
    System.out.println(num1+" % "+num2+" = "+(num1%num2));
  }
}
