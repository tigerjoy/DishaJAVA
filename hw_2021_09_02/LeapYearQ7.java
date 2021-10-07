// Scored - 2 points
import java.util.Scanner;
class LeapYearQ7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int y=sc.nextInt();
        // OBSERVATION #1
        // What should the year be divisible 
        // by for it to be a leap year?
        // Also not the correct program.
        if((y%100==0 && y%400==0) || 
           (y%100!=0 && y%4==0))
        {
            System.out.println(y+" is a leap year.");
        }
        else
        {
            System.out.println(y+" is not a leap year.");
        }
    }
}