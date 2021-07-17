import java.util.Scanner;
class MatrixQ1
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
        System.out.print("Enter element at"+ (i+1)+","+ (j+1)+": ");
        mat[i][j]=sc.nextInt();
      }
    }
  }

  void display(int mat[][])
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
    MatrixQ1 obj=new MatrixQ1();
    System.out.println("Enter the no. of rows");
    int rows=sc.nextInt();
    System.out.println("Enter the no. of cols");
    int cols=sc.nextInt();
    int mat[][]=new int[rows][cols];
    obj.input(mat);
    obj.display(mat);
  }
  
}