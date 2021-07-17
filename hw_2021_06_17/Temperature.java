import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        double celsius=sc.nextDouble();
        double Fahrenheit= (celsius * 9.0 / 5.0) + 32.0;
        System.out.println("The temperature in fahrenheit is: "+Fahrenheit);
        System.out.print("Enter temperature in fahrenheit: ");
        double k=sc.nextDouble();
        double cel=(k - 32.0) / 1.8;
        System.out.println("The temperature in celsius is: "+cel);
    }
}