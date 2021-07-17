import java.util.Scanner;
class Mensuration
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length=");
    double length = sc.nextDouble();
    System.out.println("Enter the breadth");
    double breadth = sc.nextDouble();
    double area = length*breadth;
    double perimeter = 2*(length+breadth);
    double diagonal = Math.sqrt(Math.pow(length,2)+Math.pow(breadth,2));
    System.out.println("The area is "+area);
    System.out.println("The perimeter is "+perimeter);
    System.out.println("The diagonal is "+diagonal);
  }
}