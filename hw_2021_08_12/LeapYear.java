import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int num=sc.nextInt();
        if(num % 400==0)
        {
            System.out.println(num+" is a  centennial year.");
        }
        else if(num % 4==0)
        {
            System.out.println(num+" is a  leap year.");
        }
        else
        {
            System.out.println(num+" is not a  leap year.");
        }
    }
}