import java.util.Scanner;
class Formula
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a=sc.nextDouble();
        System.out.println("Enter value of b: ");
        double b=sc.nextDouble();
        System.out.println("Enter value of c: ");
        double c=sc.nextDouble();
        System.out.println("According in Sri-Dhar Acharya's formula");
        double d=Math.pow(b,2)-4*a*c;
        System.out.println("The answer is "+d);
        if(d>=0)
        {
            System.out.println("Roots are real");
        }
        else if(d<0)
        {
            System.out.println("Roots are imaginary");
        }
    }
}