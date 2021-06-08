import java.util.*;
class Symmetric {
  public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int r,c,i,j,flag=1;
  System.out.println("enter no of rows and columns");
  r=s.nextInt();
  c=s.nextInt();
  if(r==c)
  {
	int[][] matrix=new int[r][c];
  System.out.println("enter the matrix elements");
  for(i=0;i<r;i++) {
    for(j=0;j<c;j++)
    {
      a[i][j]=s.nextInt();
    }
  }  
  int[][]trans=new int[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++) {
      b[i][j]=a[j][i];
	  if(b[i][j]!=a[i][j])
	  {
	  flag=0;
	  break;
	  }
	  }
  }
 if(flag==0)
  System.out.println("Matrix is not SYMMETRIC!!");
 else
 System.out.println("Matrix is SYMMETRIC");
  }
  else
  System.out.println("Matrix is NOT SYMMETRIC!!(");
  
 
  }
  
}