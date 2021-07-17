import java.util.Scanner;
class Diagonal
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
  int sumOfPrincipal(int mat[][])
  {
    int rows=mat.length;
    int sum=0;
    for(int i=0;i<=rows-1;i++)
    {
      sum=sum+mat[i][i];
    }    
    return sum;
  }
  int sumOfSecondary(int mat[][])
  {
    int rows=mat.length;
    int cols=mat[0].length;
    int sum=0;
    for(int i=0;i<=rows-1;i++)
    {
      sum=sum+mat[i][(cols-1)-i];
    }    
    return sum;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Diagonal obj=new Diagonal();
    System.out.println("Enter the size of matrix");
    int M=sc.nextInt();
    int rows=M;
    int cols=M;
    int mat[][]=new int[rows][cols];
    obj.input(mat);
    int principal=obj.sumOfPrincipal(mat);
    int secondary=obj.sumOfSecondary(mat);
    System.out.println("Sum of principal diagonals: "+principal);
    System.out.println("Sum of secondary diagonals: "+secondary);
  }
}