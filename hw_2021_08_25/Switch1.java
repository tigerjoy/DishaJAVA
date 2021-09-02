// Scored - 4.5 points
import java.util.Scanner;
class Switch1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle: ");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth of a rectangle: ");
        double breadth=sc.nextDouble();
        System.out.println("Press 1 to calculate area");
        System.out.println("Press 2 to calculate perimeter");
        System.out.println("Press 3 to calculate diagonal");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                double area=length*breadth;
                System.out.println("The area of the rectangle is "+area);
                break;
            }
            case 2:
            {
                double perimeter=2*(length+breadth);
                System.out.println("The perimeter of the rectangle is "+perimeter);
                break;
            }
            case 3:
            {
                double diagonal=Math.sqrt(Math.pow(length,2)+(Math.pow(breadth,2)));
                System.out.println("The diagonal of the rectangle is "+diagonal);
                break;
            }
            default:
            {
              System.out.println("WRONG CHOICE");
            }
          }
        }
    }
