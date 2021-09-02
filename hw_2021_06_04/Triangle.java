// Scored - 10 points
import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perpendicular of the triangle: ");
        double perpendicular=sc.nextDouble();
        System.out.println("Enter the base of the triangle: ");
        double base=sc.nextDouble();
        double hypotenuse=Math.sqrt(Math.pow(perpendicular,2)+Math.pow(base,2));
        System.out.println("Hypotenuse of the triangle is: "+hypotenuse);
        double area= 1.0/2.0*base*perpendicular;
        System.out.println("Area of the triangle is: "+area);
        double perimeter= perpendicular+base+hypotenuse;
        System.out.println("Perimeter of the triangle is: "+perimeter);
    }
}