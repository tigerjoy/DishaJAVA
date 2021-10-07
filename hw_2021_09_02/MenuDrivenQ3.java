// Scored - 1 point
import java.util.Scanner;
class MenuDrivenQ3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Area of Equilateral Triangle.");
        System.out.println("2.Area of Isosceles Triangle.");
        System.out.println("3.Area of Scalene Triangle.");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                {
                    System.out.println("Enter the side of an equilateral triangle: ");
                    double s=sc.nextDouble();
                    // OBSERVATION #1
                    // Wrong formula used.
                    double area1=(Math.sqrt(3)/4.0)*s*s;
                    System.out.println("Area of an equilateral triangle is:"+area1);
                    break;
                }
            case 2:
                {
                    System.out.println("Enter the base of an Isosceles triangle: ");
                    double b=sc.nextDouble();
                    System.out.println("Enter the side of an Isosceles triangle: ");
                    double a=sc.nextDouble();
                    double area2=(1.0/4.0)*b*Math.sqrt(4*a*a-b*b);
                    System.out.println("Area of an Isosceles triangle is:"+area2);
                    break;
                }
            case 3:
                {
                    System.out.println("Enter the 1st side of an Scalene triangle: ");
                    double a=sc.nextDouble();
                    System.out.println("Enter the 2st side of an Scalene triangle: ");
                    double b=sc.nextDouble();
                    System.out.println("Enter the 3st side of an Scalene triangle: ");
                    double c=sc.nextDouble();
                    // OBSERVATION #2
                    // Wrong formula used. 
                    double s=(a+b+c)/2.0;
                    double area3=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                    System.out.println("Area of an Scalene triangle is:"+area3);
                    break;
                }
            default:
                System.out.println("WRONG CHOICE");
        }
    }
}