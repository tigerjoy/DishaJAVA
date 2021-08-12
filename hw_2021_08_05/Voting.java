import java.util.Scanner;
class Voting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible To Vote. ");
        }
        else
        {
            int x=(18-age);
            System.out.println("Come Back After "+x+" years");
            System.out.println("You Are Not Eligible To Vote. ");
        }
    }
}