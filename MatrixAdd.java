import java.util.*;
public class MatrixAdd
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no:of rows in matrix 1 :");
		int r1 = in.nextInt();
		System.out.println("Enter the no:of columns in matrix 1:");
		int c1 = in.nextInt();
		int mat1[][] = new int[r1][c1];
		System.out.println("Enter the no:of rows in matrix 2 :");
		int r2 = in.nextInt();
		System.out.println("Enter the no:of columns in matrix 2:");
		int c2 = in.nextInt();
		int mat2[][] = new int[r2][c2];
		int mat3[][] = new int[r2][c2];
		System.out.println("Enter the matrix 1 elements : ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				mat1[i][j]=in.nextInt();
			}
		}
		System.out.println("Matrix 1 elements : ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(mat1[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.println("Enter the matrix 2 elements : ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				mat2[i][j]=in.nextInt();
			}
		}
		System.out.println("Matrix 2 elements : ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(mat2[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.println("Adding 2 matrices....\n");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("Sum of matrix 1 and matrix 2 is :");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(mat3[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}