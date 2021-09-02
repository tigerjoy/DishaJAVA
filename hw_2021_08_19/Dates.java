import java.util.Scanner;
class Dates
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Date: ");
        String date1=sc.nextLine();
        System.out.println("Enter Second Date: ");
        String date2=sc.nextLine();
        if(date1.compareTo(date2)>0)
        {
            System.out.println(date1+" is greater");
        }
        else if(date1.compareTo(date2)<0)
        {
            System.out.println(date1+" is smaller");
        }
        else if(date1.compareTo(date2)==0)
        {
            System.out.println("Both Dates Are Equal");
        }
    }
}