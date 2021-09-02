import java.util.Scanner;
class Showroom
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Price: ");
    double totalPrice=sc.nextDouble();
    double discount=0.0;
    if(totalPrice<=2000)
    {
      System.out.println("YOU HAVE WON A WALL CLOCK");
      discount=(5.0/100.0)*totalPrice;
    }
    // 2001 to 5000
    else if(totalPrice>=2001 && totalPrice<=5000)
    {
      System.out.println("YOU HAVE WON A SCHOOL BAG");
      discount=(10.0/100.0)*totalPrice;
    }
    // 5001 to 10000
    else if(totalPrice>=5001 && totalPrice<=10000)
    {
      System.out.println("YOU HAVE WON AN ELECTRIC IRON");
      discount=(15.0/100.0)*totalPrice;
    }
    // More than 10001
    else
    {
      System.out.println("YOU HAVE WON A WRIST WATCH");
      discount=(20.0/100.0)*totalPrice;
    }
    double amount=totalPrice-discount;
    System.out.println("AMOUNT TO BE PAID="+amount);
    System.out.println("DISCOUNT OFFERED="+discount);
  }
}