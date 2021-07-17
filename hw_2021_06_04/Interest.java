import java.util.Scanner;
class Interst
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principle : ");
        int p=sc.nextInt();
        System.out.print("Enter the rate of interest : ");
        double r=sc.nextDouble();
        System.out.print("Enter the time : ");
        double t=sc.nextDouble();
        double SI= p*r*t/100;
        System.out.println("SIMPLE INTERST IS : "+SI);
        double Amount= p*Math.pow(1+r/100.0,t);
        double CI=Amount-p;
        System.out.println("COUMPOUND INTERST IS :"+CI);
        double Difference=SI-CI;
        System.out.println("Difference is: "+Difference);
    }
}