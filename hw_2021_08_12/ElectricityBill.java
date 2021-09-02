import java.util.Scanner;
public class ElectricityBill
{
    String name;
    long mobileNumber;
    int units;
    double bill;
void accept()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name of the customer: ");
    name=sc.nextLine();
    System.out.println("Enter the mobile number of the customer: ");
    mobileNumber=sc.nextLong();
    System.out.println("Enter Units consumed: ");
    units=sc.nextInt();
}
void calculate()
{
    double surcharge;
    if(units<=100)
    {
        bill=units*5.5;
    }
    else if(units<=200)
    {
        bill=100*5.5+((units-100)*6.5);
    }
    else if(units<=300)
    {
        bill=100*5.5+200*6.5+((units-200)*7.5);
    }
    else 
    {
        bill=100*5.5+200*6.5+300*7.5+((units-500)*8.5);
    }
}
void print()
{
    System.out.println("NAME OF THE CUSTOMER: "+name);
    System.out.println("MOBILE NUMBER OF THE CUSTOMER: "+mobileNumber);
    System.out.println("NUMBER OF UNITS CONSUMED: "+units);
    System.out.println("BILL AMOUNT OF THE CUSTOMER: "+bill);
}
public static void main(String args[])
{
    ElectricityBill obj=new ElectricityBill();
    obj.accept();
    obj.calculate();
    obj.print();
}
}