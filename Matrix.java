import java.util.*;
class Matrix
{
public static void main(String args[])
{
	int i,j;
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the number size of matrix : ");
int row = sc.nextInt();
int col = sc.nextInt();
 
int matrix1[][] = new int[row][col];
int matrix2[][] = new int[row][col];
int add[][] = new int[row][col];
 
System.out.println("Enter the elements of matrix1 : ");
 
for (i= 0 ; i < row ; i++ )
{ 
for (j= 0 ; j < col ;j++ )
matrix1[i][j] = sc.nextInt(); 
System.out.println();
}
System.out.println("Enter the elements of matrix2");
 
for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < col ;j++ )
matrix2[i][j] = sc.nextInt();
 
System.out.println();
}
 
for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < col ;j++ )
add[i][j] = matrix1[i][j] + matrix2[i][j] ; 
 
System.out.println("Sum of matrices : ");
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(add[i][j]+"\t");
 
System.out.println();
}
 
}
}