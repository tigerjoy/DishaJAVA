import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first side: ");
        int firstside=sc.nextInt();
        System.out.println("Enter a second side: ");
        int secondside=sc.nextInt();
        System.out.println("Enter a third side: ");
        int thirdside=sc.nextInt();
        if((firstside+secondside)>thirdside)
        {
            System.out.println("Triangle is possible");
        }
        else if((secondside+thirdside)>firstside)
        {
            System.out.println("Triangle is possible");
        }
        else if((thirdside+firstside)>secondside)
        {
            System.out.println("Triangle is possible");
        }
        else
        {
            System.out.println("Triangle is not possible");
        }
        if((firstside>secondside)&&(secondside>thirdside)&&(thirdside>firstside))
        {
            System.out.println("Scalene Triangle");
        }
        else if((firstside=secondside)||(secondside=thirdside)||(thirdside=firstside))
        {
            System.out.println("Isosceles Triangle");
        }
        else 
        {
            System.out.println("Equilateral Triangle");
        }
    }
}