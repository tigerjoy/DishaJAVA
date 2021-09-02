import java.util.Scanner;
class Distinction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name=sc.nextLine();
        System.out.println("Enter the average marks: ");
        int marks=sc.nextInt();
        if(marks>80)
        {
            System.out.println("Distinction");
        }
        else if(marks>60 && marks<=80)
        {
            System.out.println("First Division");
        }
        else if(marks>40 && marks<=60)
        {
            System.out.println("Second Division");
        }
        else if(marks>45 && marks<=40)
        {
            System.out.println("Pass");
        }
        else if(marks<=40)
        {
            System.out.println("Fail");
        }
    }
}