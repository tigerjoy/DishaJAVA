// Scored - 4 points for structure
import java.util.Scanner;
class YearMonthDay 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of days:");
        int d= sc.nextInt();
        int month,year,day;
        year = d / 365;
        System.out.println("No. of years: "+year);
        int c= d*12;
        month= d / 12;
        System.out.println("No. of months: "+month);
        day = d;
        System.out.println("No. of remaining days: "+day);
    }
}