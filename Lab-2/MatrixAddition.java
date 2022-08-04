/*
-------------------------------------------------------------------------------------
Read two 2x2 matrices and perform addition of matrices into third matrix and print it.
--------------------------------------------------------------------------------------
*/




import java.util.*;
public class MatrixAddition{
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first matrix");
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				b[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				c[i][j]=(a[i][j] + b[i][j]);
			}
		}
		System.out.println("sum of matrix=");
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				System.out.print(c[i][j]);
			}
			System.out.println(" ");
		}
	}
}