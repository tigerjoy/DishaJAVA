// Scored - 4.5 points
import java.util.Scanner;
class Switch2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2=sc.nextDouble();
        System.out.println("OPTION 1:ADDITION");
        System.out.println("OPTION 2:MULTIPLICATION");
        System.out.println("OPTION 3:SUBSTRACTION");
        System.out.println("OPTION 4:DIVISION");
        System.out.println("OPTION 5:REMAINDER");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                double addition=num1+num2;
                System.out.println("The result of addition is "+addition);
                break;
            } 
            case 2:
            {
                double multiplication=num1*num2;
                System.out.println("The result of multiplication is "+multiplication);
                break;
            }
            case 3:
            {
                double substraction=num1-num2;
                System.out.println("The result of substraction is "+substraction);
                break;
            }
            case 4:
            {
                double division=num1/num2;
                System.out.println("The result of division is "+division);
                break;
            }
            case 5:
            {
                double remainder=num1%num2;
                System.out.println("The result of remainder is "+remainder);
                break;
            }
            default:
                System.out.println("WRONG CHOICE");
            }
        }
    }