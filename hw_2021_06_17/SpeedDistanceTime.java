import java.util.Scanner;
class SpeedDistanceTime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To Find The Speed");
        System.out.print("Enter the distance: ");
        double distance=sc.nextDouble();
        System.out.print("Enter the Time: ");
        double time=sc.nextDouble();
        double speed=distance/time;
        System.out.println("speed= "+speed);
        System.out.println("To Find The Distance");
        System.out.print("Enter the time: ");
        double Time=sc.nextDouble();
        System.out.print("Enter the speed: ");
        double Speed=sc.nextDouble();
        double Distance=Speed*Time;
        System.out.println("Distance= "+Distance);
        System.out.println("To Find The Time");
         System.out.print("Enter the speed: ");
        double S=sc.nextDouble();
        System.out.print("Enter the distance: ");
        double D=sc.nextDouble();
        double T=D/S;
        System.out.print("Time= "+T);
    }
}