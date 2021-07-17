import java.util.Scanner;
class Perimeter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PERIMETER OF RECTANGLE");
        System.out.print("Enter the length of the rectangle: ");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth=sc.nextDouble();
        double perimeterofrectangle=2.0*(length+breadth);
        System.out.println("perimeter of rectangle is: "+perimeterofrectangle);
        System.out.println("PERIMETER OF TRIANGLE");
        System.out.print("Enter the base of the triangle: ");
        double base=sc.nextDouble();
        System.out.print("Enter the hypotenuse of the triangle: ");
        double hypotenuse=sc.nextDouble();
        System.out.println("Enter the perpendicular of the triangle: ");
        double perpendicular=sc.nextDouble();
        double perimeteroftriangle=base+perpendicular+hypotenuse;
        System.out.println("perimeter of triangle is: "+perimeteroftriangle);
        System.out.println("PERIMETER OF CIRCLE");
        System.out.print("Enter the pi: ");
        double pi=sc.nextDouble();
        System.out.print("Enter the radius: ");
        double radius=sc.nextDouble();
        double perimeterofcircle=2.0*pi*radius;
        System.out.println("perimeter of circle is: "+perimeterofcircle);
    }
}