import java.util.*;
public class MatrixSymm
{
	public static void main(String args[])
	{
		int count=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no:of rows in matrix :");
		int r = in.nextInt();
		System.out.println("Enter the no:of columns in matrix :");
		int c = in.nextInt();
		int mat1[][] = new int[r][c];
		int mat2[][] = new int[r][c];
		System.out.println("Enter the matrix 1 elements : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat1[i][j]=in.nextInt();
			}
		}
		System.out.println("Matrix 1 elements : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat1[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat2[i][j]=mat1[j][i];
			}
		}
		System.out.println("Transpose of Matrix 1 : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat2[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}	
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat2[i][j]==mat1[i][j])
				{
					count++;
				}
			}
		}	
		if(count==r*c)
		{
			System.out.println("Matrix 1 is symmetric");
		}
		else
		{
			System.out.println("Matrix 1 is not symmetric");
		}
	}
}