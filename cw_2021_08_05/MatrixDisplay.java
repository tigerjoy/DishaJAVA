import java.util.Scanner;
class MatrixDisplay
{
  void input(int mat[][])
  {
    Scanner sc=new Scanner(System.in);
    int rows=mat.length;
    int cols=mat[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        System.out.print("Enter element at "+ (i+1)+","+(j+1)+":");
        mat[i][j]=sc.nextInt();
      }
    }
  }
  // Checks if num is prime
  boolean isPrime(int num)  // TOOL
  {
    int fCount=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        fCount++;
      }
    }
    if(fCount==2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  // Checks if num is composite
  boolean isComposite(int num) // TOOL
  {
    int fCount=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        fCount++;
      }
    }
    if(fCount>2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  // Displays odd elements from mat
  void displayOdd(int mat[][])
  {
    int rows=mat.length;
    int cols=mat[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        if(mat[i][j]%2==1)
        {
          System.out.print(mat[i][j]+",");
        }
      }
    }
    System.out.println();
  }
  // Displays even elements from mat
  void displayEven(int mat[][])
  {
    int rows=mat.length;
    int cols=mat[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        if(mat[i][j]%2==0)
        {
          System.out.print(mat[i][j]+",");
        }
      }
    }
    System.out.println();
  }
  // Displays composite elements from mat
  void displayComposite(int mat[][])
  {
    // We need to call the isComposite(int num)
    // isComposite(int num) -> true
    // isComposite(int num) -> false
    int rows=mat.length;
    int cols=mat[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        boolean result=isComposite(mat[i][j]); // HALT
        if(result==true)
        {
          System.out.print(mat[i][j]+",");
        }
      }
    }
    System.out.println();
  }
  // Displays prime elements from mat
  void displayPrime(int mat[][])
  {
    // We need to call the isPrime(int num)
    // isPrime(int num) -> true
    // isPrime(int num) -> false
    int rows=mat.length;
    int cols=mat[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        // boolean result=isPrime(mat[i][j]); // HALT
        if(isPrime(mat[i][j])==true)
        {
          System.out.print(mat[i][j]+",");
        }
      }
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    MatrixDisplay obj=new MatrixDisplay();
    System.out.println("Enter no. of rows");
    int rows= sc.nextInt();
    System.out.println("Enter no. of columns");
    int cols= sc.nextInt();
    int mat[][]=new int[rows][cols];
    obj.input(mat);
    System.out.println("The even no.s are");
    obj.displayEven(mat);
    System.out.println("The odd no.s are");
    obj.displayOdd(mat);
    System.out.println("The prime no.s are");
    obj.displayPrime(mat);
    System.out.println("The composite no.s are");
    obj.displayComposite(mat);
  } // End of main()
} // End of class