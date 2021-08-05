import java.util.Scanner;
class MirrorMatrix
{
  static Scanner sc=new Scanner(System.in);
  void input(int mat[][])
  {
    int rows=mat.length;
    int cols=mat[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        System.out.print("Enter element at "+(i+1)+","+(j+1)+":");
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
  int[] reverse(int arr[])
  {
    int n = arr.length;
    // int mat[][] = new int[rows][cols];
    int rev[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      rev[i]=arr[n-1-i];
    }
    return rev;
  }
  public static void main(String args[])
  {
    MirrorMatrix obj=new MirrorMatrix();
    System.out.println("Enter the value of m: ");
    int m=sc.nextInt();
    if(m>2 && m<20)
    {
      // taking input in matrix
      int mat[][]=new int[m][m];
      obj.input(mat);
      // displaying the original matrix
      System.out.println("Original matrix");
      obj.display(mat);

       // Creating the mirror matrix
       int mirrorMat[][]=new int[m][m];
       for(int i=0;i<=m-1;i++)
       {
         mirrorMat[i]=obj.reverse(mat[i]);
       }
       // Displaying the mirror matrix
       System.out.println("Mirror matrix");
       obj.display(mirrorMat);
    }
    else
    {
      System.out.println("invalid value of m");
    }
  }
}