import java.util.Scanner;
class Pattern
{
  void display(char mat[][])
  {
    int rows=mat.length;
    int cols=mat[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        System.out.print(mat[i][j]+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Pattern obj=new Pattern();
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    sc.nextLine();
    if(n>3 && n<10)
    {
      System.out.println("Enter the first character: ");
      char firstChar = sc.nextLine().charAt(0);
      System.out.println("Enter the second character: ");
      char secondChar = sc.nextLine().charAt(0);
      System.out.println("Enter the third character: ");
      char thirdChar = sc.nextLine().charAt(0);
      // 0. Create the matrix
      char mat[][]=new char[n][n];

      // 1. Fill the first character at four corners
      mat[0][0]=firstChar;
      mat[0][n-1]=firstChar;
      mat[n-1][n-1]=firstChar;
      mat[n-1][0]=firstChar;

      // 2. Fill the second character in the boundary pos
      // Row fixed -> Row 0, Row n-1
      for(int j=1;j<=n-2;j++)
      {
        mat[0][j]=secondChar;
        mat[n-1][j]=secondChar;
      }
      // Column fixed -> Col 0, Col n-1
      for(int i=1;i<=n-2;i++)
      {
        mat[i][0]=secondChar;
        mat[i][n-1]=secondChar;
      }

      // 3. Fill the third character in non-bounary pos
      for(int i=1;i<=n-2;i++)
      {
        for(int j=1;j<=n-2;j++)
        {
          mat[i][j]=thirdChar;
        }
      }

      obj.display(mat);
    }
    else
    {
      System.out.println("Invalid value of n");
    }
  }
}