import java.util.Scanner;
class GradeMarks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of student");
        System.out.print("Physics Marks:");
        int p=sc.nextInt();
        System.out.print("Chemistry Marks:");
        int c=sc.nextInt();
        System.out.print("Biology Marks:");
        int b=sc.nextInt();
        int total=p+c+b;
        System.out.println("Total Marks:"+total);
        double average= total/3;
        System.out.println("Average marks:"+average);
    }
}