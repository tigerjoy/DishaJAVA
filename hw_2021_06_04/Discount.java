import java.util.Scanner;
class Discount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of laptop: ");
        double price1=sc.nextInt();
        System.out.println("Enter the price of printer: ");
        double price2=sc.nextInt();
        double discount1=15.0/100.0*price1;
        double discount2=10.0/100.0*price2;
        System.out.println("Discount on laptop is: "+discount1);
        System.out.println("Discount on printer is: "+discount2);
}
}