import java.util.Scanner;

class TypeOfNumber {
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

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    TypeOfNumber obj = new TypeOfNumber();
    if (obj.isAbundant(num)) {
      System.out.println(num + " is Abundant.");
    } else if (obj.isPerfect(num)) {
      System.out.println(num + " is Perfect.");
    } else {
      System.out.println(num + " is Deficient.");
    }
  }
}