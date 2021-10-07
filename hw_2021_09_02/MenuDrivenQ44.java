// Scored - 5 points
import java.util.Scanner;

class MenuDrivenQ44 
{
  int sumOfFactors(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

  boolean isAbundant(int num) {
    int sum = sumOfFactors(num);
    if (sum > num) {
      return true;
    } else {
      return false;
    }
  }

  boolean isDeficient(int num) {
    int sum = sumOfFactors(num);
    if (sum < num) {
      return true;
    } else {
      return false;
    }
  }

  boolean isPerfect(int num) {
    int sum = sumOfFactors(num);
    if (sum == num) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("1. TO CHECK IF IT IS A PERFECT NUMBER PRESS 1. ");
    System.out.println("2. TO CHECK IF IT IS A ABUNDANT NUMBER PRESS 2. ");
    System.out.println("3. TO CHECK IF IT IS A DEFICIENT NUMBER PRESS 3. ");
    System.out.println("Enter your choice: ");
    int choice = sc.nextInt();
    MenuDrivenQ44 obj=new MenuDrivenQ44();
    int lb = 0, ub = 0;
    if((choice>=1) && (choice<=3))
    {
      System.out.println("Enter the lowerbound");
      lb=sc.nextInt();
      System.out.println("Enter the upperbound");
      ub=sc.nextInt();
    }
    switch(choice)
    {
      case 1:
      {
        for(int i=lb;i<=ub;i++)
        {
            if(obj.isPerfect(i))
            {
                System.out.print(i+" , ");
            }
        }
        break;
      }
      case 2:
      {
        for(int i=lb;i<=ub;i++)
        {
            if(obj.isAbundant(i))
            {
                System.out.print(i+" , ");
            }
        }
        break;
      }
      case 3:
      {
        for(int i=lb;i<=ub;i++)
        {
            if(obj.isDeficient(i))
            {
                System.out.print(i+" , ");
            }
        }
        break;
      }
      default:
        System.out.println("Wrong Choice.");
    } 
  }
}