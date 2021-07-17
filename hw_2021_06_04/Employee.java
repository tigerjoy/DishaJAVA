import java.util.Scanner;
class Employee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic pay: ");
        double basic=sc.nextDouble();
        double dearnessallowance=25.0/100.0*basic;
        System.out.println("Dearness Allowance is: "+dearnessallowance);
        double houserent=15.0/100.0*basic;
        System.out.println("House Rent Allowance is: "+houserent);
        double providentfund=8.33/100.0*basic;
        System.out.println("Provident Fund is: "+providentfund);
        double netpay=dearnessallowance + houserent + providentfund;
        System.out.println("Net pay is: "+netpay);
        double grosspay=netpay-providentfund;
        System.out.println("Gross pay is: "+grosspay);
    }
}